package Recursion;

public class Subsequence {
    public static void subseq(String s , int indx , String newstr){
        if(indx == s.length()){
            System.out.println(newstr);
            return ;
        }
        char currchar = s.charAt(indx);

        //to be 
        subseq(s, indx+1, newstr + currchar);

        //or not to be
        subseq(s, indx+1, newstr);
    }
    public static void main(String[] args){
        String s = "abc";
        subseq(s, 0, "");

    }
    
}
