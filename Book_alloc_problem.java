public class Book_alloc_problem {

    static boolean valid(int []books , int n , int m , int mid){
        int st = 1;
        int pages = 0;
        for(int i = 0 ; i<n ; i++){
            if(books[i] > mid) return false;
            if(pages + books[i] <= mid){
                pages = pages + books[i];
            }else{
                st++;
                pages = books[i];
            }
            if(st>m){
                return false;
            }

        }

        return true; 
    }
    public static void main(String[] args){
        int []books = {2,1,3,4};
        int n = books.length;
        int m = 2;
        int st = 0;
        int end = 10;
        int ans = 0;
        while (st<=end) {
            int mid = st + (end - st)/2;
            if(valid(books , n , m, mid)){
                end = mid -1;
                ans = mid;
            }else{
                st = mid +1;
            }
        }

        System.out.println(ans);
    }
}
