
import java.util.*;
import java.io.*;

class Nodeeeee {

    Nodeeeee left;
    Nodeeeee right;
    int data;

    Nodeeeee(int data) {
        this.data = data;
        left = right = null;
    }
}

class Day23 {

    static void levelOrder(Nodeeeee root) {
        Queue<Nodeeeee> queue = new LinkedList<>();
        if (root == null)
            return;
        
        queue.add(root);

        while (!queue.isEmpty()) {
            Nodeeeee node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null) 
                queue.add(node.left);
            
            if (node.right != null) 
                queue.add(node.right);
            
        }

    }

    public static Nodeeeee insert(Nodeeeee root, int data) {
        if (root == null) {
            return new Nodeeeee(data);
        } else {
            Nodeeeee cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Nodeeeee root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
