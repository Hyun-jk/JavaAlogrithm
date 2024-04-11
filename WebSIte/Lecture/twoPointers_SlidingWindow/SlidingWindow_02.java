package twoPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow_02 {
    public static int solution(int n, int m, int[] arr){
        int count = 0, sum = 0 , lt=0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) count++;

            while (sum > m) {
                sum -= arr[lt++];
                if (sum == m) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("solution(n,m,arr) = " + solution(n,m,arr));







    }
}
