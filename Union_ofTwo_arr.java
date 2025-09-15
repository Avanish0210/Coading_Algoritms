import java.util.HashSet;

public class Union_ofTwo_arr {

    public static int union(int arr1[] ,int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i<arr2.length ; i++){
            set.add(arr2[i]);
        }
        return set.size();
    }

    public static int intersection(int arr1[] , int arr2[]){
        HashSet<Integer> int_set = new HashSet<>();
        for(int i = 0 ; i<arr1.length ; i++){
            int_set.add(arr1[i]);

        }
        int count = 0;
        for(int i : arr2){
            if(int_set.contains(i)){
                count++;
                int_set.remove(i);
            }

        }
        return count;
    }
    public static void main(String []args){
        int []arr1 = {7,3,9};
        int []arr2 = {6,3,9,2,9,4};
        

        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));

        
    }
    
}
