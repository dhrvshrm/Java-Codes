package Sorting;

public class SelectionSort {
    public static void array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {9,7,8,5,3,2,6,7,9,8,12};
        
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int tem = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = tem;
        }
        array(arr);
    }
}
