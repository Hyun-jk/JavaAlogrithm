import java.util.*;
public class array08_retry {

    public static int[] solution(int[] arr) {
        //Array_8 다시 풀기
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }
        Arrays.sort(arr);
        
        for (int j = 0; j < arr.length; j++) {
                int idx = hm.get(arr[j]);
                answer[idx] = j+1;
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }

    }
}
