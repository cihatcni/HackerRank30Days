
import java.util.*;
import java.io.*;

class Nodeee {

    Nodeee left;
    Nodeee right;
    int data;

    Nodeee(int data) {
        this.data = data;
        left = right = null;
    }
}

class Day22 {

    public static int getHeight(Nodeee root) {
        
    int heightLeft = 0;
    int heightRight = 0;

    if (root.left != null) {
        heightLeft = getHeight(root.left) + 1;
    }
    if (root.right != null) {
        heightRight = getHeight(root.right) + 1;
    }

  return (heightLeft > heightRight ? heightLeft : heightRight);
        
        
        
    }

    
    
    
    
    public static Nodeee insert(Nodeee root, int data) {
        if (root == null) {
            return new Nodeee(data);
        } else {
            Nodeee cur;
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
        Nodeee root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
