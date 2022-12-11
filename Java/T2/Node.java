mport java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
class InorderIterator {
    private Stack<Node> traversal;
    InorderIterator(Node root)
    {
        traversal = new Stack<Node>();
        moveLeft(root);
    }
    private void moveLeft(Node current)
    {
        while (current != null) {
            traversal.push(current);
            current = current.left;
        }
    }
    public boolean hasNext()
    {
        return !traversal.isEmpty();
    }

    public Node next()
    {
        if (!hasNext())
            throw new NoSuchElementException();

        Node current = traversal.pop();

        if (current.right != null)
            moveLeft(current.right);

        return current;
    }
}
class Test {
    public static void main(String args[])
    {
        Node root = new Node(5);
        root.right = new Node(7);
        root.left = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(1);

        InorderIterator itr = new InorderIterator(root);
        try {
            System.out.print(itr.next().data + " ");
            System.out.print(itr.hasNext() + " ");
            System.out.print(itr.next().data + " ");
            System.out.print(itr.next().data + " ");
            System.out.print(itr.next().data + " ");
            System.out.print(itr.hasNext() + " ");
            System.out.print(itr.next().data + " ");
            System.out.print(itr.next().data + " ");
            System.out.print(itr.hasNext() + " ");
        }
        catch (NoSuchElementException e) {
            System.out.print("No such element Exists");
        }
    }
}