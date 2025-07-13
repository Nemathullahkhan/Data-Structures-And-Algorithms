public class InsertionSort {
    public static void insertionSort(int []arr){
        /**
         * Insertion Sort algorithm builds a sorted array one element at a time.
         * It is much less efficient on large lists than more advanced algorithms such as quicksort,
         * mergesort, or heapsort.
         * Time Complexity: O(n^2)
         * Space Complexity: O(1)
         */
        for (int i = 1;i<arr.length;i++){
            for(int j = i-1;j>=0;j--){
                    if(arr[j]>arr[j+1]){
                        // swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    } else{
                        break; // No need to swap if the order is correct
                    }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
