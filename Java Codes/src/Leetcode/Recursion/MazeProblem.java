package Leetcode.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        System.out.println(printpathsdisgonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        printpathsrest("", board, 0, 0);

        System.out.println();
        boolean[][] board2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        printpathsrestback("", board2, 0, 0);

        boolean[][] board3 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][]path =new int[board3.length][board3[0].length];
        printpathsrestmatrix("",board3,0,0,path,steps);

    }

    // Method to count total number of  possible outcomes
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = count(r, c - 1);
        int left = count(r - 1, c);
        return left + right;
    }

    // Print all possible  horizontal and verticle  paths
    static void printpaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }


        if (r > 1) {
            printpaths(p + "D", r - 1, c);
        }
        if (c > 1) {
            printpaths(p + "R", r, c - 1);
        }

    }

    // Print all possible paths horizontal , vertical diagonal

    static ArrayList<String> printpathsdisgonal(String p, int r, int c) {
        if (r == 1 && c == 1) {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(printpathsdisgonal(p + "D", r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(printpathsdisgonal(p + "V", r - 1, c));
        }
        if (c > 1) {
            list.addAll(printpathsdisgonal(p + "H", r, c - 1));
        }
        return list;
    }

    static void printpathsrest(String p, boolean[][] Maze, int r, int c) {
        if (r == Maze.length - 1 && c == Maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // For restriction
        if (!Maze[r][c]) {
            return;
        }

        if (r < Maze.length - 1) {
            printpathsrest(p + "D", Maze, r + 1, c);
        }
        if (c < Maze[0].length - 1) {
            printpathsrest(p + "R", Maze, r, c + 1);
        }

    }

    static void printpathsrestback(String p, boolean[][] Maze, int r, int c) {
        if (r == Maze.length - 1 && c == Maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // For restriction
        if (!Maze[r][c]) {
            return;
        }

        Maze[r][c] = false;
        if (r < Maze.length - 1) {
            printpathsrestback(p + "D", Maze, r + 1, c);
        }
        if (c < Maze[0].length - 1) {
            printpathsrestback(p + "R", Maze, r, c + 1);
        }

        if (r > 0) {
            printpathsrestback(p + "U", Maze, r - 1, c);
        }
        if (c > 0) {
            printpathsrestback(p + "L", Maze, r, c - 1);
        }
        Maze[r][c] = true;
    }

    static void printpathsrestmatrix(String p, boolean[][] Maze, int r, int c,int [][] path,int steps) {
        if (r == Maze.length - 1 && c == Maze[0].length - 1) {
            path[r][c]=steps;
            for(int [] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(p);
            return;
        }

        // For restriction
        if (!Maze[r][c]) {
            return;
        }

        Maze[r][c] = false;
        path[r][c] =steps;
        if (r < Maze.length - 1) {
            printpathsrestmatrix(p + "D", Maze, r + 1, c,path,steps+1);
        }
        if (c < Maze[0].length - 1) {
            printpathsrestmatrix(p + "R", Maze, r, c + 1,path,steps+1);
        }

        if (r > 0) {
            printpathsrestmatrix(p + "U", Maze, r - 1, c,path,steps+1);
        }
        if (c > 0) {
            printpathsrestmatrix(p + "L", Maze, r, c - 1,path,steps+1);
        }
        Maze[r][c] = true;
        path[r][c]=0 ;
    }

}
