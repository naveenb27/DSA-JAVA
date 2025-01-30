public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low;
        int j = high-1;

        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }

            while(arr[j] > pivot && j >= low){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        
        return i;
    }

    public static void print(int arr[]){
        for(int x: arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Original array:");
        print(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        print(arr);
    }
}   
