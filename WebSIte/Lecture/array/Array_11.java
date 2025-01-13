package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_11 {

    //HashMap으로 다시 풀어보고
    //강사님처럼 풀어보기도 하자
    public int solution(int num, int[][] arr) {
        int count = 0;
        int top_student = 0;

        for (int i = 0; i < num; i++) {
            ArrayList<Integer> temp_check = new ArrayList<>();
            int temp_count = 0;
            for (int j = 0; j < num; j++) {
                if(arr[i][0] == arr[i][j]){
                    if(!temp_check.contains(j)){
                        temp_check.add(j);
                        temp_count +=1;
                    }
                }
            }
            temp_check = new ArrayList<>();
            if(count < temp_count){
                top_student = i;
            }
        }
        return top_student;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Array_10 array10 = new Array_10();
        System.out.println("array10.solution(num, arr) = " + array10.solution(num, arr));
    }
}
