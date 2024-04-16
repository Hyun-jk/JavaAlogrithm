package recursive;

public class Recursive_02 {
    //이진수 출력
    public static void dfs(int n) {
        if(n ==0) return;
        else{
            dfs(n/2);
            System.out.println(n%2);
        }
    }


    public static void main(String[] args) {
        dfs(11);
    }
}
