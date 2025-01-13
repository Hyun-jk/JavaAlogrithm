package twoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers_01 {
    public ArrayList<Integer> solution(int[] num1_arr, int[] num2_arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0; int rt = 0;

        while(lt <num1_arr.length && rt< num2_arr.length){
            if(num1_arr[lt] < num2_arr[rt]){
                answer.add(num1_arr[lt]);
                lt++;
            }else if(num1_arr[lt] > num2_arr[rt]){
                answer.add(num2_arr[rt]);
                rt++;
            }else{
                answer.add(num1_arr[lt]);
                answer.add(num2_arr[rt]);
                lt++;
                rt++;
            }
        }
        if(lt < num1_arr.length){
            for (int i = lt; i < num1_arr.length; i++) {
                answer.add(num1_arr[i]);
            }
        }
        if (rt < num2_arr.length) {
            for (int j = rt; j < num2_arr.length; j++) {
                answer.add(num2_arr[j]);
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }

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

        TwoPointers_01 tp01 = new TwoPointers_01();
        tp01.solution(num1_arr, num2_arr);
        System.out.println("Arrays.toString(num1_arr) = " + Arrays.toString(num1_arr));
        System.out.println("Arrays.toString(num2_arr) = " + Arrays.toString(num2_arr));


    }
}


