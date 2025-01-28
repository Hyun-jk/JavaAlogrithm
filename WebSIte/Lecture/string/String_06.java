package string;

import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
    문제 요약
    목표: 소문자로 된 문자열에서 중복된 문자를 제거하고, 원래 문자열의 순서를 유지하여 출력하는 프로그램 작성.
    제한 사항: 문자열의 길이는 최대 100자.

    예시
    입력: ksekkset
    출력: kset
 */

public class String_06 {
    public static void main(String[] args) {
//방법1 - ArrayList의 contains 메서드를 활용하여 풀기
//효율성 - ArrayList의 contains 메서드는 O(n) 시간 복잡도를 가진다.
//     - 따라서 전체 시간 복잡도는 O(n2)이 된다.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        ArrayList<String> arr = new ArrayList<>();
//
//        for (char x : str.toCharArray()) {
//            if(!arr.contains(String.valueOf(x))) {
//                arr.add(Character.toString(x));
//            }
//        }
//        System.out.println("arr.toString() = " + arr.toString());

//방법2 - LinkedHashSet사용하기
//     - Set 인터페이스의 구현체인 LinkedHashSet은 중복을 허용하지 않으며, 삽입 순서를 유지한다.
////효율성 - 중복 검사와 삽입이 O(1) 시간에 이루어져 전체 시간 복잡도를 O(n)으로 줄일 수 있다.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        Set<Character> uniqueChars = new LinkedHashSet<>();
//
//        for (char c : str.toCharArray()) {
//            uniqueChars.add(c);
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (char uniqueChar : uniqueChars) {
//            result.append(uniqueChar);
//        }
//        System.out.println("result = " + result);
//    }
        
//방법3 - boolean 배열을 사용한 방법
//효율성 - 메모리 사용이 적음, 실행 속도가 매우 빠르다. 단 소문자만 처리 가능
    
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            int index = c - 'a'; // 'a'를 0으로, 'b'를 1로...
            if (!seen[index]) {
                seen[index] = true;
                result.append(c);
            }
        }
        System.out.println("result = " + result);

    }

}
