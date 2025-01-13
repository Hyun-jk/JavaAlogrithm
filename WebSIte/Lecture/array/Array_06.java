package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_06 {
    //다시 <<<
    //최대 메모리를 많이 차지하고
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num_arr = new int[num];
        int max_num = 0;

        for(int i = 0; i< num; i++){
            num_arr[i] = sc.nextInt();
            max_num = Math.max(max_num,num_arr[i]);
        }

        int[] check = new int[max_num+1];
        check[0] = 1; check[1] = 1;

        for(int i = 2; i<= max_num; i++){
            System.out.println("i = " + i);
            if(check[i] == 0){//소수이면
                for(int j = i+i; j<= max_num; j+=i){
                    check[j] = 1;
                }
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int x : num_arr) {
            int temp_num = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
            if(check[temp_num] != 1) answer.add(temp_num);
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
