package string;

import java.util.Scanner;

public class String_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.next();
        String answer = "";
//       1.  Character method를 사용하는 방법
//        for (char x : temp.toCharArray()) {
//            if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
//            else answer += Character.toUpperCase(x);
//        }
//        System.out.println(answer);

//      2.아스키 넘버를 사용하는 방법
//      소문자 a ~ z= 97 ~ 122 / A~Z = 65~90
        for (char x : temp.toCharArray()) {
            if( x >= 65 && x <= 90 ) answer += (char)(x+32);
            else answer += (char)(x -32);
        }
        int a = 'a';
        System.out.println(a);
        System.out.println("answer = " + answer);

    }
}
