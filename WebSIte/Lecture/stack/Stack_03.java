package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_03 {
    static int solution(int[][] board, int[] moves,int n, int m) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                //인형이 있을 때
                if (board[i][move - 1] != 0) {
                    board[i][move - 1] = 0;
                    int temp = board[i][move - 1];
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer +=2;
                        stack.pop();
                    }else{stack.push(move);}
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int k = 0; k < m; k++) {
            moves[k] = sc.nextInt();
        }
        System.out.println("solution(board,moves,n,m) = " + solution(board,moves,n,m));
    }
}
