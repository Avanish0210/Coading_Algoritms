package Recursion;

public class Check_duplicates {
    public static boolean[] map = new boolean[26];
    public static void Cheack_charr(String s ,int indx , String newstr){
        if(indx == s.length()){
            System.out.println(newstr);
            return;
        }


        if(map[s.charAt(indx) - 'a' ] == true){
            Cheack_charr(s, indx+1, newstr);

        }else{
            newstr += s.charAt(indx);
            map[s.charAt(indx) - 'a'] = true;
            Cheack_charr(s, indx+1, newstr);
        }


    }
    public static void main(String []args){ 
        String s = "abbccda";
        Cheack_charr(s, 0, "");
        
    }
    
}
