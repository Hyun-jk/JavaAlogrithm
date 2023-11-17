import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] plans = br.readLine().split(" ");

        int x = 1, y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for(int i = 0; i < plans.length; i++){
            char plan = plans[i].charAt(0);
            int nx = 0, ny = 0;
            for(int j = 0; j < 4; j++){
                if(plan == moveTypes[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(1<= nx && nx <= N && 1<= ny && ny <=N){
                x = nx;
                y = ny;
            }

        }
        System.out.println( x+ ":" +y);



    }
}
