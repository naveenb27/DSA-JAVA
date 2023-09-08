
class MergeSort {
    public static void merge(int left[], int right[], int arr[]){
        int i=0, j=0, k=0;
        
        while(i<left.length && j<right.length){
           if(left[i]>right[j]){
               arr[k++] = right[j];
               j++;
           }else{
               arr[k++] = left[i];
               i++;
           }
       }
       while(i<left.length){
           arr[k++] = left[i];
           i++;
       }
       while(j<right.length){
           arr[k++] = right[j];
           j++;
       }
    }
    public static void mergeSort(int arr[]){
        int len = arr.length;
        if(len<=1){
            return;
        }
        int mid = len/2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];
        for(int i=0; i<mid;i++){
            left[i] = arr[i];
        }
        for(int i=mid; i<len-1; i
            right[i] = arr[i-mid];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }
    public static void display(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2};
        
        mergeSort(arr);
        display(arr);
    }
}
