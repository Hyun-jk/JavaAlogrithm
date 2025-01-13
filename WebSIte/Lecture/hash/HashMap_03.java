package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_03 {
    public int[] solution(int n , int k, int[] arr) {
        int[] answer = new int[k];
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
        HashMap_03 hm03 = new HashMap_03();
        System.out.println(hm03.solution(n,k,arr));
    }
}
