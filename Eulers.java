import java.util.*;
public class Eulers{
    static int gcd(int a , int b){
        while(a!=0){
            int reminder = b%a;
            b=a;
            a=reminder;
        }
        return b;
    }
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int count = 1;

        for(int i = 2 ; i<b ;i++){
            if(gcd(i,b)==1){
                count++;
            }
        }
        System.out.println(count);
        
    } 
}

