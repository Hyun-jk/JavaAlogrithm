package hash;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_02 {

    public String solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char key = str1.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for (int j = 0; j < str2.length(); j++) {
            char key = str2.charAt(j);
            if(!map.containsKey(key) || map.get(key) == 0) {return "NO";}
            else{map.put(key,map.get(key)-1);
            }
        }
        return "Yes";
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        HashMap_02 hm02 = new HashMap_02();
        System.out.println("hm02.solution(str1,str2) = " + hm02.solution(str1,str2));
        
        
    }
}
