import java.util.*;
public class Lexicographically_First_Palindromic_String{
    public static void swap(int[] arr , int i , int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args){

        String str = "aabc";
        char[] chararray = str.toCharArray();
        int[] arr = new int[chararray.length];
        for(int i = 0 ; i<chararray.length ; i++){
            arr[i] = chararray[i]-'a';

        }
        

        //pivot entry
        int pivot = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
                pivot = i-1;
                break;
            }

        }

        //right most
        int Rmax = 0;
        for(int i = arr.length-1 ; i>pivot ;i-- ){
            if(arr[pivot] < arr[i]){
                Rmax = i;
                break;
            }

        }
        swap(arr, pivot, Rmax);

        //reverse
        int st = pivot+1 , end = arr.length-1;
        while (st<=end) {
            swap(arr, st, end);
            st++;
            end--;
            
        }
        //converting int array to string
        
        String ans = "";

        //lexicographical in int form
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        //in string form
        for(int i = 0 ; i<arr.length;i++){
            ans = ans + (char)(arr[i]+'a');
        }
        System.out.println(ans);



    }
}