import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class practice {


    static int solution(String str){
        Stack<Integer> stk = new Stack<>();
        for (char c : str.toCharArray()) {
            System.out.println("c = " + c);
            //숫자인 경우
            if (Character.isDigit(c)) {
                stk.push(Character.getNumericValue(c));
                System.out.println("stk.toString() = " + stk.toString());
            //숫자가 아닌 경우
            }else{
                int late_num = stk.pop();
                int fast_num = stk.pop();
                if (c == '+') {
                    stk.push(late_num +fast_num);
                }else if (c == '*') {
                    stk.push(late_num * fast_num);
                }else{
                    stk.push(late_num - fast_num);
                }
            }
        }
        int answer = stk.get(0);
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("solution(str) = " + solution(str));


    }
}
