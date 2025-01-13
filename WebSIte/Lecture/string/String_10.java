package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char temp_letter = sc.next().charAt(0);

        int[] answer = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) == temp_letter){
                p = 0;
                answer[i] = p;
            }else{
                p ++;
                answer[i] = p;
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == temp_letter){
                p = 0;
            }else{
                p ++;
                answer[i] = Math.min(answer[i], p);
            }
        }







    }
}
