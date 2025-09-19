package Recursion;

public class Permutaion_of_string {

    public static void permutaion(String s , String permut){
        if(s.length()==0){
            System.out.println(permut);
            return ;
        }

        for(int i = 0 ; i<s.length() ; i++){
            char currchar = s.charAt(i);
            //abc if currchar = a -> bc or cb
            String newstr = s.substring(0, i) + s.substring(i+1);
            permutaion(newstr, permut+currchar);

        }
    }
    public static void main(String []args){
        String s = "abc";
        permutaion(s, "");
        

    }
    
}
