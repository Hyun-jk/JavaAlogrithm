package twoPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class TP_SW_01 {
    //왜케 간단하게 짜시지?
    public int solution(int n , int k, int[] arr){
        int[] arr_temp = arr.clone();
        int answer = 0; int count = 0; int lt = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
            //Arr에 값이 0이 아니면
            if(arr[i] != 0){
                count++;
                System.out.println("count = " + count);
            
            }else{// Arr에 값이 0일 경우
                if(k >0){ //변경할 수 있는 횟수가 남아있을 때;
                    k--;
                    arr_temp[i] = 1;
                    count++;
                    System.out.println(" ======변경할 수 있는 횟수가 남아있을 때;==========");
                    System.out.println("k = " + k);
                    System.out.println("Arrays.toString(arr_temp) = " + Arrays.toString(arr_temp));
                    System.out.println("count = " + count);
                    System.out.println(" ============================== ");
                    
                }else{ // 변경할 수 있는 횟수가 0일 경우 , 앞에서 0을 1로 변경해야함.
                    System.out.println(" ======변경할 수 있는 횟수가 0일 경우;==========");
                    System.out.println("i = " + i);
                    answer = Math.max(answer,count);
                    System.out.println("answer = " + answer);
                    System.out.println(" ============================== ");
                    while(k == 0 ){
                        if(arr[lt]!= 0){
                            lt++;
                            count--;
                            System.out.println(" ======while문안에서 0이 아닐때;==========");
                            System.out.println("lt = " + lt);
                            System.out.println("count = " + count);
                            System.out.println(" ============================== ");
                            
                        }else{//0이면
                            arr_temp[lt] = 0;
                            k++;
                            count--;
                            System.out.println(" ======while문 0일때;==========");
                            System.out.println("k = " + k);
                            System.out.println("count = " + count);
                            System.out.println("Arrays.toString(arr_temp) = " + Arrays.toString(arr_temp));
                            System.out.println(" ============================== ");
                        }
                    }
                }
            }
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
        TP_SW_01 tpsw = new TP_SW_01();
        System.out.println(tpsw.solution(n, k, arr));
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
