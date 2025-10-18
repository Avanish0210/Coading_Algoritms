import java.util.*;
public class Max_equil_Sum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-7,1,5,2,-4,3,0};







{1,5,2,4,3}
{14,9,7,3,0}
{0,1,6,8,12}

for(int i = 0 ; i<n ; i++){
    if(prefix[i]==suffix[i]){
        System.out.println(i);
        System.out.println(arr[i]);
    }
}

int[] prefix 
prefix[0] =0;
//prefix
for(i 0 - n){
    prefix[i] = arr[i] + prefix[i-1]

}


//suffix
int[] suffix
suffix[n-1] = 0
for(int i = 0 ; i<n ; i++){
    suffix[i] = arr[i] + suffix[i+1]
}
















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
