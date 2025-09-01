import java.util.*;
public class DotchNnational_flag_algo {
    public static void main(String[] args){
        int []arr = {2,0,2,1,1,0,1,2,0,0};
        int n = arr.length;

        //assign three pointers low , mid , high
        int low = 0;
        int mid = 0;
        int high = n-1;

        // 0 = 0 to low-1
        // 1 = low to mid-1
        // 2 = high + 1 to n-1
        //unsorted = mid to high
        //slowly unsorted part decreases

        while(mid<=high){
            if(arr[mid] == 0 ){
                ///swap
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;

            }else{
                mid++;
            }
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]);
        }
    }
}
