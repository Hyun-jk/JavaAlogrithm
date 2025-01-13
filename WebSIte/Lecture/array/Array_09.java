package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_09 {

    public int solution(int num, int[][] arr){
        int max_sum = 0;

        for (int i = 0; i < num; i++) {
            int row_sum = 0;
            int col_sum = 0;
            int dia_sum1 = 0;
            int dia_sum2 = 0;

            //이렇게 구해도 괜찮을 것 같은데 굳이 for문을 2개 안돌려도...
            //다시 생각해보자
            for (int j = 0; j < num; j++) {
                row_sum += arr[i][j];
                col_sum += arr[j][i];
                dia_sum1 += arr[i][j];
                dia_sum2 += arr[i][j];
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        Array_09 arr09 = new Array_09();
        System.out.println("arr09.solution(num,arr) = " + arr09.solution(num,arr));
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));




    }

}
