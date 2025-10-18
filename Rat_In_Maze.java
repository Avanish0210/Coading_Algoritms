import java.util.*;
public class Rat_In_Maze {

    public static void helper(int[][] matrix , int r , int c ,List<String> ans , String path ){
        int n = matrix.length;
        //base cases
        if(r<0 || c<0 || r>=n || c>=n || matrix[r][c]==0 || matrix[r][c] == -1){
            return;
        }
        if(r==n-1 && c==n-1){
            ans.add(path);
            return;
        }
        //temp[r][c] = true;
        matrix[r][c] = -1;

        helper(matrix, r+1, c, ans, path + "D");//down
        helper(matrix, r-1, c, ans, path + "U");//up
        helper(matrix, r, c+1, ans, path + "R");//right
        helper(matrix, r, c-1, ans, path + "L");//left

        //temp[r][c] = false;
        matrix[r][c] = 1;
    }

    public static List<String> findpath(int[][] matrix){
        int n = matrix.length;
        List<String> ans = new ArrayList<>();
        //boolean[][] temp = new boolean[n][n];
        String path = "";
        helper(matrix, 0, 0, ans,path);
        return ans;

    }
    public static void main(String []args){
        int[][] matrix = {{1,0,0,0} , {1,1,0,1} , {1,1,0,0} , {0,1,1,1}};
        List<String> ans = findpath(matrix);
        for(String paths : ans){
            System.out.println(paths);

        }

    }
    
}
