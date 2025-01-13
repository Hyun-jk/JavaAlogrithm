package recursive;

public class Recursive_04 {
    //1.피보나치 수열
//    public static int dfs(int n) {
//        if(n == 1 ) return 1;
//        else if( n == 2) return 1;
//        else return dfs(n - 2) + dfs(n - 1);
//    }
//    public static void main(String[] args) {
//        dfs(10);
//    }

//    //2.배열 이용
//    static int[] fibo;
//    public static int dfs(int n) {
//        if(n == 1 ) return fibo[n] = 1;
//        else if( n == 2) return fibo[n] = 2;
//        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        fibo = new int[n];
//        dfs(n);
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(fibo[i]+" ");
//        }
//
//    }

    //3.메모이제이션 사용
    static int[] fibo;
    public static int dfs(int n) {
        if(fibo[n] >0 ) return fibo[n];

        if(n == 1 ) return fibo[n] = 1;
        else if( n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        fibo = new int[n];
        dfs(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i]+" ");
        }

    }





}
