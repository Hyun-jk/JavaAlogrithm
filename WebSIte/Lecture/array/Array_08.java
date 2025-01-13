package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_08 {
    public int[] solution(int num , int[] arr) {
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            int rank = 1;
            for (int j = 0; j < num; j++) {
                if (arr[i] < arr[j]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array_08 array08 = new Array_08();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("solution(num,arr) = " + array08.solution(num,arr));
    }
}
