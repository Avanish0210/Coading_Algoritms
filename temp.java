import java.util.*;
public class temp {
    static int flip_binary(int n){
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        int max_count = 0;
        for(int digit : binaryString.toCharArray()){
            if(digit==1){
                count++;
                max_count = Math.max(max_count, count);
            }else{
                count = 0;
            }
        }
        return max_count;
    }
    
    public static void main(String[] args){
        int n = 0111011110;
        System.out.println(Integer.toBinaryString(n) + flip_binary(n));


    }
}


