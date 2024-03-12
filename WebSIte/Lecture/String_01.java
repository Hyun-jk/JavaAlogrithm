import java.util.Locale;
import java.util.Scanner;

public class String_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        int answer = 0;
        str.toUpperCase(Locale.ROOT);
        c = Character.toUpperCase(c);
//        for (int i = 0; i< str.length(); i++) {
//            if( c == str.charAt(i)) answer++;
//        }

        for (char x : str.toCharArray()) {
            if(x == c) answer++;
        }
        System.out.println("answer = " + answer);
        
    }
}
