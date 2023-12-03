import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Page149 {

    public static int N,M;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= N || y <= -1 || y >= M) {
            return false;
        }
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = temp.charAt(j) - '0';
            }

        }
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(i, j)) {
                    result +=1;
                }
            }
        }
        System.out.println(result);

    }

}
