  public class QuickSort{
    public static void quick(int arr[], int start, int end){
        if(end<=start) return;

        int partition = partition(arr,  start,  end);
        quick(arr, start, partition-1);
        quick(arr, partition+1, end);
    }
    public static int partition(int arr[], int start, int end){
        int i = start-1;
        int pivot = arr[end];
        for(int j = start; j<end; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }

        return i;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args){
        int a[] = {4, 1, 5, 23, 7, 2, 10};
        quick(a, 0, a.length-1);
        display(a);

    }
}
