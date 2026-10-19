package Stack;

import java.util.Stack;

public class ReverseStack {
    // ***using another stack***
    // public static void reverse(Stack<Integer> s){
    //     Stack<Integer> res = new Stack<>();
    //     while(!s.isEmpty()){
    //         int curr = s.pop();
    //         res.push(curr);
    //     }
    //     while(!res.isEmpty()){
    //         System.out.println(res.pop());
    //     }
    // }

    public static void pushAtBottom(Stack<Integer> s , int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        print(s);
    }
}
