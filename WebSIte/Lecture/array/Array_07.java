package array;

import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0; int answer = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("i = " + i);
            if(arr[i] == 0 ){
                count = 0;
            }else{
                count++ ;
                answer += count;
            }
        }

        System.out.println("answer = " + answer);



    }
}
