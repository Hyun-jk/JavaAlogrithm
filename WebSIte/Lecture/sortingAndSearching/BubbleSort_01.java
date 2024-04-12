package sortingAndSearching;

import java.util.Scanner;

public class BubbleSort_01 {
    static int[] solution(int n , int[] arr) {

        for (int i = 0; i < n; i++) { //횟수
            //한번 for을 돌리면 최대값은 배열 맨 오른쪽에 위치한다.
            for (int j = 0; j < n-i-1; j++) {
                int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
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
