package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_05 {
    public static String solution(String str) {
        int lt = 0; int rt = str.length()-1;
        char[] arr = str.toCharArray();

        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])){
                lt++;
            }else if(!Character.isAlphabetic(arr[rt])){
                rt--;
            }else{
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt ++;
                rt--;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("str = " + solution(str));

    }
}
