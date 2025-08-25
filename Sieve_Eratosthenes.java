
import java.util.*;
import java.util.ArrayList;
//import java.util.Arrays;
public class Sieve_Eratosthenes{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //default they set to false;
        boolean[] is_prime = new boolean[n+1];
        //Arrays.fill(is_prime , true);
        //set true
        for(int i = 0 ; i<n ; i++){
            is_prime[i] = true;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 2 ; i<n ; i++){
            if(is_prime[i] == true){
                ans.add(i);
                for(int j = i*2 ; j<n ; j = j+i){
                    is_prime[j] = false;
                }
            }
        }
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i) + " , ");
        }
        

    }

}