public class factorial {
    static int fact(int n){
        int factorial = 1;
        while(n>0){
            factorial = factorial * n;
            n = n-1;
        }
        return factorial;
    }

    public static void main(String [] args){
        int n = 4;
        int r = 2;
        int a = fact(n) / fact(n-r);
        int b = fact(r);
        int ans = a/b;

        System.out.println(ans);
    }
    
}
