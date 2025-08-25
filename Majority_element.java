public class Majority_element {
    public static void main(String[] args){
        int arr[] = {1,1,1,2,2};
        int count = 0;
        int ans = arr[0];
        for(int i =0 ; i<arr.length ; i++){
            if(count==0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(ans);
    }
    
}
