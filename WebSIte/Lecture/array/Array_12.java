package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_12 {
    public int solution(int student_num, int test_num, int[][] test_result) {

        int count = 0;
        for (int i = 1; i < student_num; i++) {//멘토
            for (int j = 1; j < student_num; j++) { //멘티
                for (int k = 0; k < test_num; k++) { //테스트 수
                    //다 했는데 왜 끝까지 안했닝
                }

            }
        }

        return 10;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student_num = sc.nextInt();
        int test_num = sc.nextInt();
        int[][] test_result = new int[test_num][student_num+1];

        for (int i = 0; i < test_num; i++) {
            for (int j = 1; j < student_num; j++) {
                test_result[i][j] = sc.nextInt();
            }
        }

        Array_12 array12 = new Array_12();
        array12.solution(student_num, test_num, test_result);

        System.out.println("Arrays.deepToString(test_result) = " + Arrays.deepToString(test_result));


    }
}
