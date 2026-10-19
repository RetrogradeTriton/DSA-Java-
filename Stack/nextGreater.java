package Stack;
import java.util.*;
public class nextGreater{
    public static void main(String[] args) {
        int nums[] = {6,8,0,1,3};
        int nextgrt[] = new int[nums.length];
        Stack<Integer> s= new Stack<>();

        for(int i=nums.length-1;i>=0;i--){
            //while
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()) nextgrt[i]=-1;
            else{
                nextgrt[i]=nums[s.peek()];
            }
            //push
            s.push(i);
        }

        for(int i=0;i<nextgrt.length;i++){
            System.out.print(nextgrt[i]+" ");
        }
    }
}