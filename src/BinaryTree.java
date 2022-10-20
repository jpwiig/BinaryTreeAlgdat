import java.util.ArrayDeque;

public class BinaryTree {
    Node root;

    static class Node {
        char val;
        Node leftChild;
        Node rightChild;

        Node(char val){
            this.val = val;
            this.leftChild = null;
            this.rightChild = null;
        }
        Node addLeftChild (char val){
            return this.leftChild = new Node(val);
        }
        Node addRightChild (char val){
          return this.rightChild = new Node(val);
        }


    }
    BinaryTree(char []val){
        ArrayDeque<Node> queue = new ArrayDeque<>();
        root = new Node(val[0]);
        queue.addLast(root);

        int i = 1;
        while (i < val.length){
            Node current = queue.removeFirst();
            current.addLeftChild(val[i]);
            queue.addLast(current.leftChild);

            if (i < val.length -1) {
                current.addRightChild(val[i + 1]);
                queue.addLast(current.rightChild);
            }
            i +=2;
        }
    }
    public static void printDepthFirst (Node current, int order){
        if (current == null) return;
       if(order == 1) System.out.print(current.val);
        printDepthFirst(current.leftChild, order);
        if (order == 2) System.out.print(current.val);
        printDepthFirst(current.rightChild, order);
        if (order == 3) System.out.print(current.val);

    }
    public static void main(String[] args) {

        Node root = new Node('!');
        System.out.println(root.val + "\n " + root.rightChild + "\n " + root.leftChild);

        char [] vals = "!GTALDA".toCharArray();
        BinaryTree bt = new BinaryTree(vals);
        printDepthFirst(bt.root, 1);
        System.out.println();
        printDepthFirst(bt.root, 2);
        System.out.println();
        printDepthFirst(bt.root, 3);

    }
}
