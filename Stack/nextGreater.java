package Stack;
import java.util.*;
public class nextGreater{
    public static void main(String[] args) {
        int nums[] = {6,8,0,1,3};
        int nextgrt[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        //next greater in right side
        for(int i=nums.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }

            //2 if else
            if(s.isEmpty()){
                nextgrt[i] = -1;
            }
            else{
                nextgrt[i] = nums[s.peek()];
            }

            //push the idx
            s.push(i);
        }
        for(int i=0;i<nextgrt.length;i++){
            System.out.print(nextgrt[i]+" ");
        }
    }    
        
}