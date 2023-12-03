import java.util.Arrays;
import java.util.Scanner;

public class Page93 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //배열의 수
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int first = arr[n - 1];
        int second = arr[n - 2];
        int result = 0;

        while (m != 0){
            for(int i =0; i<k; i++){
                if (m == 0){
                    break;
                }
                result += first;
                m -= 1;
            }
            result += second;
            m -= 1;
        }
        System.out.println(result);

    }
}
