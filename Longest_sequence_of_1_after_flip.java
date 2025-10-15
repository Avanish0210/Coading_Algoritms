import java.util.ArrayList;
import java.util.List;

public class Longest_sequence_of_1_after_flip {

    public static void main(String []args){
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
        int n = arr.length;
        List<Integer> zeros = new ArrayList<>();
        int maxlength = 0;

        for(int i = 0 ; i<n ; i++){
            if(arr[i] == 0){
                zeros.add(i);
            }
        }

        for(int i : zeros){
            int count = 0;
            arr[i] = 1;
            int localmax = 0;
            for(int j = 0 ; j<n ; j++){
                if(arr[j]==1){
                    count++;
                    localmax = Math.max(localmax, count);
                }else{
                    count = 0;
                }

            }
            maxlength = Math.max(maxlength, count);
            arr[i] = 0;
        }

        System.out.println(maxlength);
      

    }
    
}
