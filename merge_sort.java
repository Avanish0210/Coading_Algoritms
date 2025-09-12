import java.util.*;
public class merge_sort {
    public static void main(String []args){
        int []a = {1,2,3};
        int m = a.length;
    
        int []b = {2,5,6};
        int n = b.length;

        ArrayList<Integer> c = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<m && j<n){
            if(a[i] < b[j]){
                c.add(a[i]);
                i++;
            }else if(a[i] > b[j]){
                c.add(b[j]);
                j++;
            }else{
                c.add(b[j]);
                c.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            c.add(a[i]);
            i++;
        }
        while(j<n){
            c.add(b[j]);
            j++;
        }
        for(int num : c){
            System.out.print(num);

        }
    }
}
