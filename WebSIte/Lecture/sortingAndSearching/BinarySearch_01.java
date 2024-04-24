package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_01 {

    static int solutiong(int n, int m , int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0; int rt = n-1;
        while (lt <= rt) {
            int mid = (lt + rt) /2;
            if(arr[mid] == m){ //배열을 돌면서 해당 값을 찾았을 경우
                answer = mid +1;
                break;
            }
            if(arr[mid] > m) rt = mid-1; //
            else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
