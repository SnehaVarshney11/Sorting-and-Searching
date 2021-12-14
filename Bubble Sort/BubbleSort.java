public class BubbleSort {
    void bubbleSort(int[] ar){
        int n = ar.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }    
    void printArray(int[] ar){
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] ar = {64, 34, 25, 12, 22, 11, 90};
        bs.bubbleSort(ar);
        System.out.println("Array after sorting");
        bs.printArray(ar);
    }
}
