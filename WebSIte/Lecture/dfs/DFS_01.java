package dfs;

 class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}
public class DFS_01 {
    //이진트리 순회
    static Node root;

    public static void DFS(Node root) {
        if (root == null) {
            return;
        }else{
            //전위순회
            //System.out.println(root.data + "");
            //DFS(root.lt);
            //DFS(root.rt);

            //중위순회
            //DFS(root.lt);
            //System.out.println(root.data + "");
            //DFS(root.rt);

            //후위순회
            //DFS(root.lt);
            //System.out.println(root.data + "");
            //DFS(root.rt);
        }

    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }

}
