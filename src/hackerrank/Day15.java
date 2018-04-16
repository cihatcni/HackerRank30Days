import java.io.*;
import java.util.*;

class Nodee {
	int data;
	Nodee next;
	Nodee(int d) {
        data = d;
        next = null;
    }
}

class Day15 {
    
    
    
    
    
    public static  Nodee insert(Nodee head,int data) {
        Nodee temp ;
        temp=head;
        Nodee ele;
        if (temp == null) {
            temp= new Nodee(data);
            head=temp;
        }
        else {
            while(temp.next!=null) {
                temp=temp.next;
            } 
            ele = new Nodee(data);
            temp.next=ele;
        }
        
        
        return head;
    }
    
    
    
    
    
    
    
    public static void display(Nodee head) {
        Nodee start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Nodee head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}