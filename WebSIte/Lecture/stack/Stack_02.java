package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_02 {

    static String solution(String str) {

        Stack<Character> st = new Stack<>();
        String answer ="";
        for (char x : str.toCharArray()) {
            if (x == ')') {
                //st.pop() 꺼내고 return을 받는다.
                while(st.pop() != '('){
                }
            }else{
                st.push(x);
            }
        }
        for (char x : st) {
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));

    }
}
