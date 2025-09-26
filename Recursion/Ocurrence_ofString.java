//package Recursion;

public class Ocurrence_ofString {
    //declare some static variables so that our value does not change during recursion

    public static int first = -1;
    public static int last  = -1;

    public static void occurence(String s ,char elment,  int indx){
        if(indx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(indx) == elment){
            if(first == -1){
                first = indx;
            }else{
                last = indx;
            }
        }
        occurence(s, elment ,indx + 1);
    }
    public static void main(String []args){
        String s = "abaacdaefaah";
        occurence(s,'a' , 0);
    }
    
}
