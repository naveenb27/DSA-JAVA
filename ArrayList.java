import java.util.*;


class DynamicArrayList{
    private final int initial_Array = 4;
    private int[] arr;
    private int capacity;
    private int size;
    DynamicArrayList(){
        size = 0;
        capacity = initial_Array;
        arr = new int[initial_Array];
    }
    public void insert(int val){

        if(size==capacity){
            expandArray();
        }
        arr[size++] = val;
    }
    public void insert(int pos, int val){
        if(size+1==capacity)
            expandArray();
        for(int i=size; i>pos; i--){
            arr[size+1] = arr[size];
        }
        arr[pos] =val;
        size++;
    }
    public void delete(int pos){
        if(pos==size){
               size--;
        }else {
            for (int i = pos; i < size; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
    }
    public void display(){
        for(int i =0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
    public void expandArray(){
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

}

public class ArrayList{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        DynamicArrayList arr = new DynamicArrayList();

        System.out.println("\n---------------Menu----------------");
        System.out.println("1. Insert at End");
        System.out.println("2. Insert a value with position ");
        System.out.println("3. Delete a value with position ");
        System.out.println("4. Display the array");
        System.out.println("5. Stop");
        while(true){
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    int val = sc.nextInt();
                    arr.insert(val);
                    break;
                case 2:
                    System.out.println("Enter a Position: ");
                    int pos = sc.nextInt();
                    System.out.println("Eneter a value");
                    int val1 = sc.nextInt();
                    arr.insert(pos, val1);
                    break;
                case 3:
                    System.out.println("Enter a Position: ");
                    int pos1 = sc.nextInt();
                    arr.delete(pos1);
                case 4:
                    System.out.println("Array");
                    arr.display();
                case 5:
                    System.exit(0);
            }
        }
    }
}
