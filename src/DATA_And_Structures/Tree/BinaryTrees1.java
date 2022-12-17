package DATA_And_Structures.Tree;
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key= item;
        left=right=null;
    }

}
public class BinaryTrees1 {
    Node root;
    BinaryTrees1(int key){
        root=new Node(key);
    }
    BinaryTrees1(){
        root=null;
    }

    public static void main(String[] args) {
        BinaryTrees1 tree = new BinaryTrees1();
        tree.root= new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left= new Node(4);
        }
    }

