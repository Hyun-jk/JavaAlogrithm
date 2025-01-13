package twoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers_02 {

    //1번 문제랑 동일한 문제이다.
    //다시 풀 때 풀자.
    public ArrayList<Integer> solution(int num1, int num2, int[] num1_arr, int[] num2_arr){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(num1_arr);
        Arrays.sort(num2_arr);
        int lt =0; int rt = 0;


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int[] num1_arr = new int[num1];
        for (int i = 0; i < num1; i++) {
            num1_arr[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] num2_arr = new int[num2];
        for (int j = 0; j < num2; j++) {
            num2_arr[j] = sc.nextInt();
        }
        TwoPointers_02 tp02 = new TwoPointers_02();
        tp02.solution(num1,num2, num1_arr, num2_arr);



    }
}
