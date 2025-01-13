package string;

import java.util.Scanner;

public class String_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String answer = "";
        String[] arr = temp.split(" ");
        int maxLen = Integer.MIN_VALUE,pos;

        for(String x : arr){
            if (x.length() > maxLen) {
                maxLen = x.length();
                answer = x;
            }
        }
        //indexOf + subString으로 푸는 방법 다시 해보기.
        System.out.println("answer = " + answer);
        
    }
}
