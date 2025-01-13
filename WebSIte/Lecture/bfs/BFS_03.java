package bfs;
import java.util.LinkedList;
import java.util.Queue;

class Node3 {
    int data ;
    Node3 lt, rt;
    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}
public class BFS_03 {
    //Tree 말단노드까지의 가장 짧은 경로(BFS)
    static Node3 root;
    public static int BFS(Node3 root) {
        Queue<Node3> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node3 cur = q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt !=null) q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        root = new Node3(1);
        root.lt = new Node3(2);
        root.rt = new Node3(3);
        root.lt.lt = new Node3(4);
        root.lt.rt = new Node3(5);
        System.out.println(BFS(root));

    }
}
