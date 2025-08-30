import java.util.*;
public class kadanes_algorithm {
    public static void main(String [] args){
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        int n = nums.length;
        //time comp = O(N)
        //assigining the minimum value to max_sum 
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i : nums){ //for each loop
            curr_sum += i;
            max_sum = Math.max(curr_sum , max_sum);

            //one thing is differnt in kaddens algo is that a negative value make the sum less so make it as a zero and start from new fresh array
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        System.out.println(max_sum);
    }
    
}
