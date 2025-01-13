package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_01 {

    static int solution(int n, int k) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        int count = 1;

        //다른 방법도 있다.
        while (q.size() != 1) {
            System.out.println("q.toString() = " + q.toString());
            if(count == k){
                q.poll();
                count = 1;
            }else{
                q.offer(q.poll());
                count ++;
            }

        }
        return q.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("solution(n,k) = " + solution(n,k));

    }
}
