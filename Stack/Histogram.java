package Stack;
import java.util.Stack;
public class Histogram {
    public static void maxArea(int arr[]){
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //next smallest right
        Stack<Integer> s = new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //nest smallest ;eft
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //max area
        int max=0;
        for(int i=0;i<arr.length;i++){
            int heigth = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int area = heigth*width;
            max = Math.max(max, area);
        }
        System.out.println("max area is "+max);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }   
}
