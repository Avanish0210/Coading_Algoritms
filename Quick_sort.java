public class Quick_sort {
    public static void swap(int[] arr ,int st , int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp; 

    }

    public static int partition(int[] arr , int st , int end){
        int indx = st-1 , pivot = arr[end];

        //all smaller values of pivot on left 
        for(int i = st ; i<end ; i++){
            if(arr[i] <= pivot){
                indx++;
                swap(arr ,i , indx);
            }
        }
        //now after all smaller values only pivit value will be in next 
        indx++;
        swap(arr ,indx , end);//now on left smaller and right greater
        return indx;

    }
    public static void QS(int[] arr , int st , int end){
        if(st<end){
            int pivitIndex = partition(arr , st , end);
            QS(arr, st, pivitIndex-1);
            QS(arr, pivitIndex+1 , end);

        }
    }
    public static void main(String []args){

        int[] arr = {5,2,6,4,1,3};
        QS(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i);
        }

    }
    
}
