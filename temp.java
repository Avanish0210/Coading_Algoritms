public class temp{

    public static int fact(int n){
        int ans = 1;
        while(n>0){
            ans = ans * n;
            n = n-1;

        }
        return ans;
    }
    public static void main(String []args){
    int n = 4;
    System.out.println(fact(n));

    }

}