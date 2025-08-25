import java.util.*;
public class Eulers{

    static int gcd(int a , int b){
        int gcd = 1;
        while(a>0 && b>0){
            if(a>b) a = a%b;
            else b = b%a;
        }
        if(a==b) return a;
        if(a==0) return b;
        return a;

    }

    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i<b ;i++){
            if(gcd(i,b)==1){
                count++;
            }
        }
        System.out.println(count);
        
    } 
}

