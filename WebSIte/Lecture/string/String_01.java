package string;

import java.util.Scanner;

public class String_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char c = sc.next().charAt(0);

        int answer = 0;

        for (char x : str.toCharArray()) {
            if(x == c) answer++;
        }
        System.out.println("answer = " + answer);
        
    }
}
