import java.util.*;
public class Longest_sequence_1s {

    static void Binary_convert(int n , ArrayList<Integer> Binary_arr){
        while(n>0){
            int digit = n%2;
            Binary_arr.add(digit);
            n = n/2;

        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> Binary_arr = new ArrayList<>();

        Binary_convert(n ,Binary_arr );
        
        int st = 0;
        int count = 0;
        int max_count = 0;
        for(int i = 0 ; i<Binary_arr.size() ; i++){
            if(Binary_arr.get(i)==1){
                count++;
                max_count= Math.max(max_count, count);
            }else{
                count=0;
            }
        }
        System.out.println(max_count);


    }
}
