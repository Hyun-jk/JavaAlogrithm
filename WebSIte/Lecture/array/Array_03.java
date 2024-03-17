package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[2][num];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            //1 가위, 2 바위 3보
            if(arr[0][i] == 1 & arr[1][i] ==3) {answer.add("A");} 
            else if(arr[0][i] == 2 & arr[1][i] ==1) {answer.add("A");}
            else if(arr[0][i] == 3 && arr[1][i] == 2) {answer.add("A");}
            else if(arr[0][i] == arr[1][i] ){ answer.add("D");}
            else{ answer.add("B");}
        }

        for (String x : answer) {
            System.out.println("x = " + x);
        }
        




    }
}
