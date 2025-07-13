public class RecursiveBubbleSort {
    public static void bubbleSort(int []arr,int i,int j){
            if(i>=arr.length-1) return;
            if(j>=arr.length-1-i){
                bubbleSort(arr,i+1,0);
                return;
            }

            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]  = arr[j+1];
                arr[j+1] = temp;
            }
            bubbleSort(arr,i,++j);
        }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr,0,0);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
