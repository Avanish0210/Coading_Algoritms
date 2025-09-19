package Recursion;

import java.util.HashSet;

public class Unique_subseq_string {
    public static void seque(String s , int indx , String newstr , HashSet<String> set){
        if(indx==s.length()){
            if(set.contains(newstr)){
                return ;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        //to be
        seque(s, indx+1, newstr + s.charAt(indx) , set);

        //not to be
        seque(s, indx+1, newstr , set);
    }
    public static void main(String []args){
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        seque(s, 0, "", set);

    }
    
}
