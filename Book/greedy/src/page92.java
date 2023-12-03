import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Page92 {

    public static void usingScanner(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] data = new int[n];
        for(int i=0; i < n; i++){
            data[i] = scanner.nextInt();
        }

        Arrays.sort(data);
        int first = data[n-1];
        int second = data[n-2];

        int countFirst = ( m / (k +1)) * k + (m % (k + 1 ));

        int result = countFirst * first + (m - countFirst) * second;

        System.out.println(result);
    }

    public static void usingBufferdReader() throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] data = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i =0; i < n; i++){
                data[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(data);
            int first = data[n-1];
            int second = data[n-2];

            int countFirst = ( m / (k +1)) * k + (m % (k + 1 ));

            int result = countFirst * first + (m - countFirst) * second;

            System.out.println(result);



    }


    public static void main(String[] args) throws IOException{
        //usingScanner();
        usingBufferdReader();

    }

}
