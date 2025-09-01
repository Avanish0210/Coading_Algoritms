import java.util.*;
public class Max_equil_Sum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-7,1,5,2,-4,3,0};
        int n = arr.length;
        
        
        // Step 1: Compute prefix sums
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1 ; i<n ; i++){
            prefix[i]  = prefix[i-1] + arr[i];
        }

        for(int mid = 0 ; mid<n ; mid++){
            int ls = (mid==0) ? 0 : prefix[mid-1];
            int rs = prefix[n-1] - prefix[mid];

            if(ls==rs){
                System.out.println("The index of equivalence is: " + mid + " and the number is: " + arr[mid]);
                continue;
                
            }
        }
    }
}
