public class Harshad_algo {
    public static boolean Cheack_harshad(int n){
        //convert the n in string first
        String numstr = Integer.toString(n);

        //create an array to store digits
        int []arr = new int[numstr.length()];
        
        //add digits to array
        for(int i = 0 ; i<numstr.length() ; i++){
            arr[i] = numstr.charAt(i) - '0';
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        if(n%sum == 0){
            return true;
        }

        return false;
    }
    public static void main(String []args){
        int n = 21;
        if(!Cheack_harshad(n)){
            System.out.println("hagg diya bro dusra number try kro");
        }else{
            System.out.println("ekdm sahi bro fadd diye tum to");
        }
    }

}
