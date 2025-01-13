package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort_01 {

    static int[] solution(int n,int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n,arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
