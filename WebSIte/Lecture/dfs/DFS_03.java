package dfs;
//Tree 말단노드까지의 가장 짧은 경로(DFS)

class Node2 {
    int data ;
    Node2 lt, rt;
    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS_03 {
    //이진트리 순회
    static Node2 root;

    public static int DFS(int L, Node2 root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));

    }

    public static void main(String[] args) {
        root = new Node2(1);
        root.lt = new Node2(2);
        root.rt = new Node2(3);
        root.lt.lt = new Node2(4);
        root.lt.rt = new Node2(5);
        root.rt.lt = new Node2(6);
        root.rt.rt = new Node2(7);
        DFS(0,root);
    }

}


