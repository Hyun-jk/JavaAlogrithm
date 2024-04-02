package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_01 {

    public Character solution(int n, String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
                map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println("map.toString() = " + map.toString());
        int count = 0;
        char answer = ' ';
        for (char key : map.keySet()) {
            System.out.println("key = " + key);
            if(map.get(key) > count) {
                count = map.get(key);
                answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        HashMap_01 hm = new HashMap_01();
        System.out.println("hm.solution(str) = " + hm.solution(n,str));






    }
}
