package Stack;

import java.util.Stack;

public class ReverseStr{
    public static String reveString(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char c = s.pop();
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reveString("abcdef"));
    }
}