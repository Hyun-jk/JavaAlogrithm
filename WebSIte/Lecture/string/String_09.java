package string;

import java.util.Scanner;

public class String_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";

        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)){
                answer += Character.toString(x);
            }
        }

        System.out.println(Integer.parseInt(answer));



    }
}
