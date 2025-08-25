import java.util.*;
public class Block_swap_two_algo {

    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 9, 8, 0, 5, 1, 6, 4};
        int D = sc.nextInt();
        int s = arr.length;
        for(int i = 1 ; i<=D ; i++){
            for(int j = 0; j<s-1 ;j++){
                swap(arr, j, j+1);

            }
        }

        for(int i = 0 ; i<s ;i++){
            System.out.print(arr[i] + ",");
        }

    }
    
}
