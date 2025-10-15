import java.util.ArrayList;
import java.util.Scanner;

public class Leaders_inArray {
    public static void main(String []args){
        int[] arr = {17,17,4,3,5,2};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max_right = 0;
        if(max_right==arr[n-1]){
            ans.add(arr[n-1]);
        }
        for(int i = n-1 ; i>=0 ; i--){
            
            if(max_right<arr[i]){
                max_right = arr[i];
                ans.add(arr[i]);
            }

        }
        System.out.println(ans);
    }
    
}
