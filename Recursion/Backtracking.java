import java.util.ArrayList;

public class Backtracking {
    public static void ps(int []arr , ArrayList<Integer> ans,int indx){
        if(indx == arr.length){
            System.out.println(ans);
            return;
        }
        //include step
        ans.add(arr[indx]);
        ps(arr, ans, indx+1);

        //backtracking
        //arr[indx] will remove the first occuring element which is not backtracking
        //so for last elemnt use ans.size() - 1;
        ans.remove(ans.size()-1);

        //exclude
        ps(arr, ans, indx+1);
    }
    public static void main(String []args){
        int []arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        ps(arr, ans, 0);

    }
    
}
