package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] answer = new int [num];
        answer[0] = 1; answer[1] = 1;

        for (int i = 2; i < num; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));








    }
}
