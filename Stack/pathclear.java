package Stack;

import java.util.Stack;

public class pathclear {
    public static String simplify(String s){
        Stack<String> st = new Stack<>();
        String res="";
        res+="/";
        int len = s.length();
        for(int i=0; i<s.length();i++){
            String dir="";
            //skip the / everytime
            while(i<len && s.charAt(i) == '/'){
                i++;
            }

            //other than /
            while(i<len && s.charAt(i) != '/'){
                dir+=s.charAt(i);
                i++;
            }

            //check for conditions

            if(dir.equals("..") == true){
                if(!st.isEmpty()) st.pop();
            }

            else if(dir.equals(".") == true){
                continue;
            }

            else if(dir.length() != 0){
                st.push(dir);
            }
        }

        Stack<String> st2 = new Stack<>();
        //to gain correct order
        while(!st.isEmpty()){
            st2.push(st.pop());
        }

        //formating
        while(!st2.isEmpty()){
            if(st2.size() != 1){
                res+=(st2.pop()+"/");
            }
            else{
                res+=(st2.pop());
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = new String("/a/./b/../../c/");
        String res = simplify(s);
        System.out.println(res);
    }
}
