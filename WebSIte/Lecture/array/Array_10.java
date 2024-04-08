
package array;
import java.util.Scanner;

public class Array_10 {


    public int solution(int num, int[][] arr) {
        int count = 0;
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) { // 이 부분 수정
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < num && ny >= 0 && ny < num && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) count += 1;
            }
        }
        return count;
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
