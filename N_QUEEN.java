import java.util.*;
public class N_QUEEN {

    public static boolean issafe(char[][] board , int row , int col , int n){
        //horizontal
        for(int i = 0; i<n ; i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i = 0; i<n ; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i = row , j=col ; i>=0&&j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i = row , j = col ; i>=0&&j<n ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void nqueen(char[][] board , int row , int n ,List<List<String>> ans ){
        if(row == n){
            ArrayList<String> temp = new ArrayList<>();
            for(int i = 0; i<n ; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return ;
        }

        for(int i = 0 ; i<n ; i++){
            if(issafe(board , row , i , n)){
                board[row][i] = 'Q';
                nqueen(board, row+1, n, ans);
                board[row][i] = '.';
            }
        }
    }
    public static List<List<String>> N(){
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(board, 0, n, ans);
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(N());
    }
}
