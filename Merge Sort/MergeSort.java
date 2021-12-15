public class MergeSort {
    static void mergeSort(int[] ar){
        int n = ar.length;
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for(int i = 0; i < mid; i++){
            left[i] = ar[i];
        }
        for(int i = mid; i < n; i++){
            right[i] = ar[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(ar, left, right);
    }
    public static void merge(int[] ar, int left[], int right[]){
        int l = left.length;
        int r = right.length;
        int i = 0, j = 0, k = 0;
        while(i < l && j < r){
            if(left[i] <= right[j]){
                ar[k] = left[i];
                i++;
            }else{
                ar[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < l){
            ar[k] = left[i];
            i++;
            k++;
        }
        while(j < r){
            ar[k] = right[j];
            j++;
            k++;
        }
    }
    static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
          
        System.out.println();
    }
    public static void main(String[] args) {
        int[] ar = {10,2,6,87,5,3,1,7};
        int n = ar.length;
        mergeSort(ar);
        printArray(ar, n);
    }
}
