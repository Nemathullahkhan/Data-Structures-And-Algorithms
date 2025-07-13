public class RecursiveInsertionSort {
    /**
     * Recursive Insertion Sort algorithm sorts an array by recursively inserting each element into its correct position
     * (NOTE: This is not optimal appraoch for the recursive insertion sort but it works for every case i believe)
     */
    public static void insertionSort(int []arr,int i,int j){
            if(i>=arr.length) return;
            if(j<0) return;

            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]  = arr[j+1];
                arr[j+1] = temp;
                insertionSort(arr,i,j-1);
            }
            j=i;
            insertionSort(arr,i+1,j);
        }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        insertionSort(arr, 1,0);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
