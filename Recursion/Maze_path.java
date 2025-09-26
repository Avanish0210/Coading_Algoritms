//package Recursion;
//int this you got 3*3 matrix maze where you have to calculate the toatal path we have to reach at end (2,2)
public class Maze_path {
    public static int countpaths(int i ,int j , int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downpaths = countpaths(i+1, j, n, m);

        //move right
        int rightpaths = countpaths(i, j+1, n, m);

        return downpaths + rightpaths;
    }

    public static void main(String []args){
        int n = 3 , m= 3;
        int totalpath = countpaths(0, 0, n, m);
        System.out.println(totalpath);

    }
    
}
