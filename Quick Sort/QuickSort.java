public class QuickSort {
    static void swap(int[] ar, int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    static int partition(int[] ar, int low, int high){
        int pivot = ar[high];
        int i = low;
        for (int j = low; j < high; j++) {
			if (ar[j] <= pivot) {
				swap(ar, j, i);
				i++;
			}
		}
		swap(ar, i, high);
		return i;
    }
    static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi + 1, high);
        }
    }
    static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
          
        System.out.println();
    }
  
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }    
}
