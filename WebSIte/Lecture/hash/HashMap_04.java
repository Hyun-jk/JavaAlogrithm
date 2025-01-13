package hash;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_04 {

    public static int solution(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int answer = 0;
        //t.lenghth = 3    0,1,
        for (int i = 0; i < t.length() - 1; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) +1);
        }
        //2
        int lt = 0;
        for (int j = t.length() - 1; j <= s.length() - t.length(); j++) {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0) +1);
            //이렇게 풀어도 되는데 answer에 넣는게 size()로 비교해서 넣어야하는데
            // 매번 for을 돌려서 0인거를 찾을 수 없으니깐
            //
            for(char key : t.toCharArray()){
                if(!map.containsKey(key) || map.get(key) == 0){
                    break;
                }
            }
            map.put(s.charAt(lt), map.getOrDefault(s.charAt(lt), 0) - 1);

        }

        return 10;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(solution(s,t));


    }
}
