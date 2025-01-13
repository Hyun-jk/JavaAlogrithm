package sortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Point implements Comparable<Point> {
    public int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y-o.y;
        else return this.x-o.x;
    }

}
public class InsertionSort_01 {
    static int[] solution(int[] arr,int n) {


        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr, n);
    }
}
