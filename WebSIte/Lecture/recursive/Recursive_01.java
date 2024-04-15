package recursive;

public class Recursive_01 {
    //재귀함수
    public static void recursive(int n) {
        if(n ==0) return;
        else{
            System.out.println("n1 = " + n);
            recursive(n-1);
            System.out.println("n2 = " + n);
        }
    }
    public static void main(String[] args) {
        recursive(3);
    }
}
