import java.util.*;
//Time complexity = o(log(n))
public class Binary_palindrome {
    static boolean check(int n ,ArrayList<Integer> binary_array){
        int st = 0 ; 
        int end = binary_array.size()-1;
        if(n==0){
                return false;
        }
        while(st<=end){
            if(binary_array.get(st) != binary_array.get(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> binary_array = new ArrayList<>();    
        while(n>0){
            int binary = n%2;
            binary_array.add(binary);
            n = n/2;
        }
        if(check(n,binary_array)){
            System.out.println("true");
        }else{System.out.println("false");} 

    }
}
