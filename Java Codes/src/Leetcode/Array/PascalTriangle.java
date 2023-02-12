package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;
//Leetcode
/*\
*         1
*       1  1
*     1  2  1
*   1  3  3  1
* 1  4  6  4  1
*
*
*
* */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));

            }
            result.add(new ArrayList<>(row));
        }
        return result;
    }
}


