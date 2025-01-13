package string;
import java.util.Scanner;

public class String_04 {
    public static String[] solution(String[] arr){

        //StringBuilder로 사용하는 방법
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new StringBuilder(arr[i]).reverse().toString();
//        }
//        return arr;

        for (int i = 0; i < arr.length; i++) {
            char[] temp = arr[i].toCharArray();

            for (int j = 0; j < temp.length/2; j++) {
                char lt_temp = temp[j];
                temp[j] = temp[temp.length-1-j];
                temp[temp.length-1-j ] = lt_temp;

            }
            arr[i] = String.valueOf(temp);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for(String x : solution(arr)){
            System.out.println(x);
        }

    }
}
