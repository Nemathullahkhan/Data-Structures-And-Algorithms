

public class BubbleSort {
    /* 
    BUbble Sort algorithm is a simple sorting algorithm that compare adjacent elements and swaps them if they are in the wrong order. 
    Time Complexity: O(n^2)
    Space Complexity: O(1)
    */ 
    public static void bubbleSort(int []arr){
        for (int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
