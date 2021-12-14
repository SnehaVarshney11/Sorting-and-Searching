class LinearSearch{
    public static int search(int[] ar, int x){
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar = {2,3,4,10,14};
        int x = 10;
        //Call the function
        int ans = search(ar, x);
        if(ans == -1){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is present at index: " + ans);
        }
    }
}