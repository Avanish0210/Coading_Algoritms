//package Recursion;
public class Tower_of_hanaoi {
    public static void toweofhanaoi(int n, String src , String helper , String dest){
        if(n==1){
            System.out.println("transfer disk  " + n + " from  " + src + "  to  " + dest);
            return;
        }
        toweofhanaoi(n-1, src, dest, helper);
        System.out.println("transfer disk  " + n + " from  " + src + "  to  " + dest);
        toweofhanaoi(n-1, helper, src, dest);

    }
    public static void main(String[] args){
        int n = 3 ;
        toweofhanaoi(n, "S", "H", "D");
    }
    
}
