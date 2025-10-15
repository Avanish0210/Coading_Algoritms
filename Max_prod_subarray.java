public class Max_prod_subarray {

    public static void main(String []args){
        int[] arr = {4,1,0,9,8,-1,9,9};
        int n = arr.length;
        int max_prod = 0;
        int ans = 1;
        for(int i = 0; i<n ; i++){
            ans *= arr[i];
            max_prod = Math.max(ans, max_prod);
            if(ans==0){
                ans = 1;
            }
            if(ans<0){
                ans = 1;
            }
        }
        System.out.println(max_prod);
    }
    
}
