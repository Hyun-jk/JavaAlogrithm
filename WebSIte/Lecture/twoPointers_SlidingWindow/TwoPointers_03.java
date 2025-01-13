package twoPointers_SlidingWindow;

import java.util.Scanner;

public class TwoPointers_03 {
    public int solution(int n) {
        int lt = 1;
        int sum = 0; int count =0;

        for (int i = 1; i < n; i++) {
            sum += i;
            if(sum == n) {
                count++;
            }else if(sum > n){
                while(sum >n){
                    sum -= lt;
                    lt++;
                    if(sum == n) count ++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TwoPointers_03 t3 = new TwoPointers_03();
        System.out.println(" = " + t3.solution(n));



    }
}