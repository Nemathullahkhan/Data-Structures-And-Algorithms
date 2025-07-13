public class MergeSort {

    /**
     * Merge Sort algorithm is a divide-and-conquer algorithm that sorts an array by recursively dividing it into halves,
     * sorting each half, and then merging the sorted halves back together.
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     */
    public static void merge(int []arr,int s,int m,int e){
        int p1 = s;
        int p2 = m+1;

        int [] temp = new int [e-s+1];
        int idx =0;
        while(p1<=m && p2<=e){
            if(arr[p1]<=arr[p2]) temp[idx++] = arr[p1++];
            else temp[idx++] = arr[p2++];
        }
        while(p1<=m) temp[idx++] = arr[p1++];
        while(p2<=e) temp[idx++] = arr[p2++];

        // Copying the sorted elements back to the original array
        for(int i = 0; i < temp.length; i++){
            arr[s + i] = temp[i];
        }
    }

    public static void mergeSort(int []arr,int sp,int ep){
        if(sp>=ep) return;

        int mid = (sp+ep)/2;
        mergeSort(arr, sp, mid); // Sort the left half
        mergeSort(arr, mid + 1, ep); // Sort the right half
        merge(arr,sp,mid,ep);

    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
