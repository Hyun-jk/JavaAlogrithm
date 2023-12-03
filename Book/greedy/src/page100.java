import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Page100 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;

        while (n >= k){
            int target = ( n / k) * k;
            result += (n - target);
            n = target;

            if(n < k){
                break;
            }
            result += 1;
            n /= k;
        }
        result += (n -1);
        System.out.println(result);
    }
}
