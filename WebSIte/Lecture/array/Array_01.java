package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer_arr = new ArrayList<>();
        answer_arr.add(arr[0]);

        for (int j = 1; j < num; j++) {
            if(arr[j] > arr[j-1]) answer_arr.add(arr[j]);
        }

        for (int x : answer_arr) {
            System.out.print(x + " ");
        }
    }
}
