import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
//        if(newNode == null) {
//            return false;
//        }

        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while(true) {
            if(data == temp.getData()) {
                return false;
            }

            if(data < temp.getData()) {
                //insert to left
                //check if temp is already having a left child
                if(temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return true;
                }
                temp = temp.getLeft();
            }
            else {
                //insert to right
                //check if temp has a right child?
                if(temp.getRight() == null) {
                    temp.setRight(newNode);
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }

    public void preOrder() { //P-L-R
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.print("PreOrder: ");
        while(temp != null || !stack.empty()) {
            while(temp != null) {
                System.out.print(temp.getData() + " ");
                stack.push(temp);
                temp = temp.getLeft();
            }

            temp = stack.pop().getRight();
        }

        System.out.println();
    }

    public void inOrder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.print("InOrder: ");
        while(temp != null || !stack.empty()) {
            while(temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }
            temp = stack.pop();
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
        }
        System.out.println();
    }

    public int getMax() {
        if(root == null) {
            return -1;
        }

        Node temp = root;
        while(temp.getRight() != null) {
            temp = temp.getRight();
        }

        return temp.getData();
    }

    public boolean find(int data) {
        Node temp = root;

        while(temp != null) {
            if(temp.getData() == data) {
                return true;
            }
            if(data < temp.getData()) {
                temp = temp.getLeft();
            }
            else {
                temp = temp.getRight();
            }
        }

        return false;
    }
}
