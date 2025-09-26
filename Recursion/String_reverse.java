//package Recursion;

public class String_reverse {
    public static void reverse(String s , int indx){
        if(indx < 0){
            return ;
        }
        System.out.print(s.charAt(indx));
        reverse(s, indx - 1);
 
    }
    public static void main(String []args){
        String s = "abcdhjbdkwudcs";
        reverse(s, s.length()-1);

    }
    
}
