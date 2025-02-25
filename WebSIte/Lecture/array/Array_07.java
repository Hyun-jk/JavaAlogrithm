package array;

import java.util.Scanner;

public class Array_07 {
    // OX 채점 결과 배열을 받아 총 점수를 계산하는 메서드
    public static int calculateScore(int[] results) {
        int totalScore = 0;
        int currentStreak = 0;  // 연속 정답 횟수

        for (int result : results) {
            if (result == 1) {           // 정답이면
                currentStreak++;         // 연속 정답 수 증가
                totalScore += currentStreak; // 누적 점수에 현재 연속 정답 점수 추가
            } else {                     // 오답이면
                currentStreak = 0;       // 연속 정답 수 초기화
            }
        }

        return totalScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 문제 개수
        int[] results = new int[n];

        // 채점 결과 입력
        for (int i = 0; i < n; i++) {
            results[i] = sc.nextInt();
        }

        // 총 점수 계산 및 출력
        System.out.println(calculateScore(results));
    }
}
