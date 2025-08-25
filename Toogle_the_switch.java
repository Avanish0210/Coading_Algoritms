import java.util.*;
public class Toogle_the_switch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int close = 0 ;
        int open = 0;

        boolean door[] = new boolean[n+1];

        for(int i = 1 ; i<=n ; i++){
            for(int j = i ; j<=n ; j= j+i){
                if(door[j]==false){
                    door[j] = true;
                }else{
                    door[j] = false;
                }

            }
        }

        for(int i = 1 ; i<=n ; i++){
            if(door[i] == true){
                open++;

            }else{
                close++;
            }
        }

        System.out.println("the number of door are close" + " " + close);
        System.out.println("the number of door are open" + " " +    open);

    }
}
