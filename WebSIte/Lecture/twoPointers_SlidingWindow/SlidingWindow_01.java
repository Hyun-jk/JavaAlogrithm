package twoPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow_01 {
    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            temp += arr[i];
        }
        for (int j = k; j < arr.length; j++) {
            temp += + arr[j] - arr[j-k];
            answer = Math.max(answer,temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        SlidingWindow_01 sw01 = new SlidingWindow_01();
        System.out.println("answer = " + sw01.solution(n,k,arr));



    }
}
