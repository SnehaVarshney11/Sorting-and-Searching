public class SelectionSort {
    void sort(int[] ar){
        int n = ar.length;
        for(int i = 0; i < n-1; i++){
            int min_index = i;
            //To find min index
            for(int j = i+1; j < n; j++){
                if(ar[j] < ar[min_index]){
                    min_index = j;
                }
            }
            //Swap the found min element with first index
            int temp = ar[min_index];
            ar[min_index] = ar[i];
            ar[i] = temp;
        }
    }
    //Prints the array
    void printArray(int[] ar){
        int n = ar.length;
        for(int i = 0; i < n; ++i){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] ar = {65,25,12,22,11};
        ss.sort(ar);
        System.out.println("Sorted Array");
        ss.printArray(ar);
    }    
}
