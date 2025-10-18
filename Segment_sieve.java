import java.util.*;

public class Segment_sieve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n+1];
        for(int i = 0 ; i<n+1;i++){
            arr[i] = true;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 2; i<Math.sqrt(n) ; i++){
            if(arr[i]==true){
                //ans.add(i);
                for(int j = i*2 ; j<n ; j=j+i){
                    arr[j]=false;
                }

            }
        }

        for(int i = 0 ; i<n ; i++){
            if(arr[i]==true){
                ans.add(i);
            }
        }

        System.out.println(ans);

    }

}