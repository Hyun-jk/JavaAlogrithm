package string;

import java.util.Scanner;
import java.util.SortedMap;

public class String_07 {

    public static String solution(String str){
        //1.StringBuiler && String.equalsIgnoreCase 사용
//        String temp = new StringBuilder(str).reverse().toString();
//        if (temp.equalsIgnoreCase(str)) {return "YES";
//        }else return "NO";

        //2.그냥 비교
        str = str.toUpperCase();
        int str_length = str.length();
        for (int i = 0; i < str_length / 2; i++) {
            if(str.charAt(i) != str.charAt(str_length-1-i)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}
