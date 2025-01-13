package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> arr = new ArrayList<>();

        for (char x : str.toCharArray()) {
            if(!arr.contains(String.valueOf(x))) {
                arr.add(Character.toString(x));
                System.out.println("arr = " + arr);
            }
        }
        System.out.println("arr.toString() = " + arr.toString());

        //IndexOf로 푸는방법 다시

    }
}
