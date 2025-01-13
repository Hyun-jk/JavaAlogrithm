import java.util.*;

class Pair{
    int y;
    int x;
    public Pair(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
public class practice {
    public static void main(String[] args) {

        //2차원 좌표를 받아서 pair로 받아서 정렬하는 방법
        Pair[] a= {
                new Pair(1,2),
                new Pair(3,4),
                new Pair(2,5),
                new Pair(10,23)
        };
        Arrays.sort(a,(p1,p2) -> (p1.y == p2.y) ? Integer.compare(p2.x,p1.x) :
        Integer.compare(p1.y,p2.y));
        for (Pair pair : a) {
            System.out.println("pair.y , parir.x = " + pair.y+ ","+ pair.x);
        }
        System.out.println("===================");
        //stream이용해서 배열 안에 맞는값 찾기
        int[] b = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = Arrays.stream(b).anyMatch(value -> value == target);
        System.out.println("found = " + found);
        System.out.println("===================");


        //stream의 reduce이용해서 배열 사용하기
        int[] c = {1, 2, 3, 4, 5};
        int ret = Arrays.stream(c).reduce(0, (x, y) -> x + y);
        System.out.println("ret = " + ret);
        System.out.println("===================");

        //stream의 map사용하기
        int[] array = {1, 2, 3, 4, 5};
        int[] ret1 = Arrays.stream(array).filter(e->e%2 ==0).map(e -> e * 2).toArray();
        for (int i : ret1) {
            System.out.println("i = " + i);
        }
        System.out.println("===================");

        //HashMap과 Stream이용하기
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("a", 1);
        mp.put("b", 10);
        mp.put("c", 100);
        for (String s : mp.keySet()) {
            System.out.println("s = " + s);
        }
        mp.values().stream().forEach(e -> System.out.println("e = " + e));
        mp.keySet().stream().forEach(e -> System.out.println("e = " + e));
        System.out.println("===================");

        //Array.fill사용해보기
        int[] f = new int[5];
        Arrays.fill(f,30);
        for (int i : f) {
            System.out.println("i = " + i);
        }
        System.out.println("===================");

        //2차원 배열 fill
        int[][] k = new int[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(k[i], 30);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("k+["+ i+ "]"+"["+j+"]");
                System.out.println(k[i][j]);
            }
        }

        System.out.println("===================");
        //배열 카피
        int[] j = {1, 2, 1, 4, 5};
        int[] l = new int[j.length];
        System.arraycopy(j, 0, l, 0, j.length);



    }
}
