import java.util.Scanner;

public class String_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt( str.length()-i-1)){
                break;
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
