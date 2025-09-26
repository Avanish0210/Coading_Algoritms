import java.util.ArrayList;

public class Strobogrammatic_Number {
    static boolean match_number(int leftval , int rightval){
        if(leftval==0 && rightval==0) return true;
        if(leftval==1 && rightval==1) return true;
        if(leftval==8 && rightval==8) return true;
        if(leftval==6 && rightval==9) return true;
        if(leftval==9 && rightval==6) return true;
        return false;

    }

    static boolean check(ArrayList<Integer> array){
        int start = 0 ;
        int end = array.size()-1;
        while (start<= end) {
            if(!match_number(array.get(start), array.get(end))){
                return false;

            }
            start++;
            end--;
        }
        
        return true;
    }
    
    public static void main(String [] args){
        int n = 108;
        ArrayList<Integer> array = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            n = n/10;
            array.add(digit);

        }
        if(check(array)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}
