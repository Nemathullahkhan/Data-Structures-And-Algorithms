public class CountSort {
    /**
     * STEPS:
     * 1. Find the maximum element in the array to determine the range of the count array.
     * 2. Create a count array of size (max + 1) initialized to zero.
     * 3. Count the occurrences of each element in the input array and store them in the count array.
     * 4. Modify the count array such that each element at each index stores the sum of previous counts.
     * 5. Build the output array by placing each element at its correct position based on the count array.
     * 6. Copy the sorted elements back to the original array.
     */
    public static void countSort(int []arr){
        // Find the maximum element in the array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int [] count = new int[max + 1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i =0;i<count.length;i++){
            if(count[i]>0){
                for (int j = 0; j < count[i]; j++) {
                    arr[k++] = i;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
