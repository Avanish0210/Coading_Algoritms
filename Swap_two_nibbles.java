import java.util.*;
public class Swap_two_nibbles {
    static void binary(int n , ArrayList<Integer> Binary_arr){
        while(n>0){
            int digit = n%2;
            Binary_arr.add(digit);
            n = n/2;

        }
        while (Binary_arr.size() < 8) {
            Binary_arr.add(0);  // add zeros at MSB side (end of list in LSB-first)
        }
    }
    static void swap(ArrayList<Integer> Binary_arr){
        int st = 0 ;
        int end = Binary_arr.size()-4;
        while(st<=end && end<Binary_arr.size()){
            Collections.swap(Binary_arr, st, end);
            st++;
            end++;
        }
        
    }
    public static void main(String[] args){
        int n = 100;
        ArrayList<Integer> Binary_arr = new ArrayList<>();
        binary(n, Binary_arr);
        swap(Binary_arr);

        double ans = 0;
        for(int i = 0 ; i<Binary_arr.size();i++){
            ans = ans + Binary_arr.get(i)*Math.pow(2, i);
        }
        System.out.println("After nibble swaping the number will be :" +ans);
    }
}
