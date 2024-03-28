package string;

import java.util.Scanner;

public class String_08 {
    public static String solution(String str){

        str = str.replaceAll("[^A-Za-z]","");
        String temp = new StringBuilder(str).reverse().toString();

        if(temp.equalsIgnoreCase(str)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
