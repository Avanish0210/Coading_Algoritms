public class joseup_problem {
    public static int joseup(int n , int k){
        if(n==1){
            return 1;
        }else{
            return (joseup(n-1, k) + k-1) % n+1;
        }
    }
    public static void main(String[] args){
        int n = 6 , k = 2;
        System.out.println(joseup(n, k));

    }
    
}
