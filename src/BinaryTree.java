public class BinaryTree {
    static class Node {
        char val;
        Node leftChild;
        Node rightChild;

        Node(char val){
            this.val = val;
            this.leftChild = null;
            this.rightChild = null;
        }
        void addLeftChild (char val){
            this.leftChild = new Node(val);
        }
        void addRightChild (char val){
            this.rightChild = new Node(val);
        }


    }

    public static void main(String[] args) {

        Node root = new Node('Ø');
        System.out.println(root.val + "\n " + root.rightChild + "\n " + root.leftChild);

    }
}
