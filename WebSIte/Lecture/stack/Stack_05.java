package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_05 {
    static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                // ')' 닫는 표시일 때;
                if(str.charAt(i-1) == '('){ //레이저일 때
                    stack.pop();
                    answer += stack.size();
                }else{//레이저가 아니라 그냥 쇠막대기일 때
                    stack.pop();
                    answer +=1;
                    //stack.pop();
                    //if(str.charAt(i-1)=='(') cnt+=stack.size();
                    //else cnt++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
