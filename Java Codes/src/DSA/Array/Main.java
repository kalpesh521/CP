package DSA.Array;
import java.util.*;

////
public class Main {
    static final int N = 314514;
    static List<Integer>[] g = new List[N];
    static int[] vis = new int[N];
    static int[] act = new int[N];
    static int[][] dp = new int[N][26];
    static String s;
    static int n, m, ans;

    static void dfs(int u) {
        vis[u] = act[u] = 1;
        for (int v : g[u]) {
            if (act[v] == 1) {
                System.out.println(-1);
                System.exit(0);
            }
            if (vis[v] == 0) {
                dfs(v);
            }
            for (int i = 0; i < 26; i++) {
                dp[u][i] = Math.max(dp[u][i], dp[v][i]);
            }
        }
        dp[u][s.charAt(u) - 'a']++;
        for (int i = 0; i < 26; i++) {
            ans = Math.max(ans, dp[u][i]);
        }
        act[u] = 0;
    }

    static int beauty(int n, int m, String s, int[] x, int[] y) {
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            g[x[i]].add(y[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                dfs(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        s = "#" + scanner.next();

        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            y[i] = scanner.nextInt();
        }

        System.out.println(beauty(n, m, s, x, y));
    }
}

