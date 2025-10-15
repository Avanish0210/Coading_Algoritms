import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SORTED_UNIQUE_PERMUTATION {
    public static void permutatio(String sorted , String permut , SortedSet<String> s){
        if(sorted.length()==0){
            //SortedSet<String> s = new TreeSet<>();
            if(!s.contains(permut)){
                s.add(permut);
            }
            //System.out.println(permut);
            return;
        }
        for(int i = 0 ; i<sorted.length();i++){
            char currchar = sorted.charAt(i);
            String newstr = sorted.substring(0,i) + sorted.substring(i+1);
            permutatio(newstr, permut + currchar , s);
        }
    }
    public static void main(String[] args){
        
        String str = "AAC";
        //sort the string
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String sorted = new String(c);

        //created sorted set to add all permut string in ordered form and have unique
        SortedSet<String> s = new TreeSet<>();
        permutatio(sorted, "" ,s);
        System.out.println(s);






    }
    
}
