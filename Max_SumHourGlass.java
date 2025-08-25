import java.util.*;
public class Max_SumHourGlass {

    static int max_sum(int [][]mat , int R , int C){
        int max_sum = 0;
        int sum ;
        //less that 3 not possible
        if(R<3 || C<3){
            System.out.println("NOT POSSIBLE  ");
        }
        //possible hour glass
        int possible = (R-2)*(C-2);
        //Printing pattern
        for(int i = 0 ; i<R-2;i++){
            for(int j = 0 ; j<C-2;j++){
                sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) + (mat[i+1][j+1]) + (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
                max_sum = Math.max(max_sum,sum);
            }
        }
        return max_sum;
        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C= sc.nextInt();
        int [][]mat = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.println("The max sum of the Hour glass :"+max_sum(mat, R, C));
        
    }
}
