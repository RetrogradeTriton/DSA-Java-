package Stack;

import java.util.Stack;

class Node{
    char data;
    Node next;

    Node(char data){
        this.data = data;
        this.next = null;
    }
}
public class llpalindrom {
    public static boolean isPalindrom(Node head){
        Node curr = head;
        Stack<Character> s = new Stack<>();
        while(curr!=null){
            s.push(curr.data);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            char top = s.pop();

            if(top != curr.data) return false;

            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next= new Node('B');
        head.next.next.next.next = new Node('A');
        System.out.println(isPalindrom(head));
    }
}
