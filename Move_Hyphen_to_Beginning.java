public class Move_Hyphen_to_Beginning {
    public static void main(String[]args){
        String str = "hello-world-";
        char[] chararray = str.toCharArray();
        int i = chararray.length-1;

        for(int j = i ; j>=0 ; j--){
            if(chararray[j]!='-'){
                char c = chararray[i];
                chararray[i] = chararray[j];
                chararray[j] = c;
                i--;

            }

        }

        //making char array to string o(n^2)
        String result = "";
        for(int j = 0 ; j<chararray.length ; j++){
            result += chararray[j];

        }
        System.out.println(result);

        //making chr in string in o(n)
        System.out.println(String.valueOf(chararray));
        

    }
    
}
