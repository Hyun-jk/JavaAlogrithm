package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_01 {

    public static String solution(String str) {

        Stack<Character> st = new Stack<>();
        String answer = "Yes";

        for (char x : str.toCharArray()) {
            if(x == ')'){
                if(st.empty()){return "NO";}
                st.pop();
            }else{
                st.push(x);
            }
        }
        if(!st.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));



    }
}
