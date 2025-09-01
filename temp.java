import java.util.*;
public class temp {
    
    public static void main(String[] args){
        int []arr = {2,0,2,1,1,0,1,2,0,0};
        int n = arr.length;
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i] == 0) zero++;
            if(arr[i] == 1) one++;
            if(arr[i] == 2) two++;
            
        }
        int indx = 0;
        for(int i = 0 ; i<zero ; i++){
            arr[indx++] = 0;
        }
        for(int i = 0 ; i<one ; i++){
            arr[indx++] = 1;        
        }
        for(int i = 0; i<two; i++){
            arr[indx++] = 2;
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]);
        }
    }
    
}


