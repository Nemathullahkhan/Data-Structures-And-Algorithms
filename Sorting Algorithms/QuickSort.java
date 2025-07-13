public class QuickSort {
    /**
     * QuickSort is an efficient sorting algorithm that uses a divide-and-conquer approach.
     * It works by selecting a pivot element from the array (typically the last element),
     * Paritioning the array into two sub-arrays accordign to pivot value, where elements less than the pivot go to the left and elements greater than the pivot go to the right
     * Time Complexity: O(n log n) on average, O(n^2) in the worst case
     * Space Complexity: O(log n) due to recursive stack space
     */
    public static int parition(int []arr,int sp,int ep){
        int pivot = arr[ep];
        int p1 = sp;
        int p2 = ep-1;
        while(p1<=p2){
            if(arr[p1]<=pivot) p1++;
            else if (arr[p2]>pivot) p2--;
            else{
                // swap arr[p1] and arr[p2]
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
            }
        } 
        // swap arr[p1] and arr[ep]
        int temp = arr[p1]; 
        arr[p1] = arr[ep];
        arr[ep] = temp;
        return p1; // Return the partition index
    }

    public static void quickSort (int []arr,int sp,int ep){
        if(sp >= ep) return;
        int paritionIndex= parition(arr,sp,ep);
        quickSort(arr,0,paritionIndex-1);
        quickSort(arr,paritionIndex,ep);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
