package Recursion;
//time complexity -> O(4^n)    max length = n   max choices = 4
public class KEYPAD_COMBINATION {
    public static String[] keypad = {"." , "abc" , "def" , "ghi" ,"jkl" , "mno" , "pqrs" , "tu" , "vwx" ,"yz"};

    public static void print_comb(String s , int indx , String combination){
        if(indx == s.length()){
            System.out.println(combination);
            return;
        }
        char currchar = s.charAt(indx);
        String mapping = keypad[currchar - '0'];

        for(int i = 0; i<mapping.length() ; i++){
            print_comb(s, indx+1, combination + mapping.charAt(i));
        }
    }
    public static void main(String[] args){
        String s = "23";
        print_comb(s, 0, "");
         
    }
}
