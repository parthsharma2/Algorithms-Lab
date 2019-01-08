
public class InsertionSort {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted Array: ");
        printArray(arr);
        sort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }   
}
