public class Moores_algo {
    public static void main(String[] args){
        int []nums = {2,2,1,1,1,2,2};
        int n = nums.length;
        int freq = 0;
        int ans = nums[0];

        //same element freq++
        //diff element freq--
        for(int i=0 ; i<n; i++){
            if(freq==0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            }else{
                freq--;
            }
        }
        System.out.println(ans);
    }
}
