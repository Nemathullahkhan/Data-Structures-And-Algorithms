public class SelectionSort {

    public static void selectionSort(int []arr){
        /**
         * Selection Sort algorithm is sorting algorithm that divides the input array into two parts: a sorted part and an unsorted part.
         * Finds the minimum element from the unsorted part and swaps it with the first unsorted element.
         *         * Time Complexity: O(n^2)
         *         * Space Complexity: O(1)
         * 
         */
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i =0;i<arr.length-1;i++){
            min = arr[i];
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        System.out.println("Sorted array: ");
      for (int num: arr){
            System.out.print(num + " ");
        }
    }
}
