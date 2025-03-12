import java.util.Scanner;

public class QuickSort {
    public static void quickSortfunc(int arr[], int low, int high) {
        if (low < high) { 
            int pIndex = partition(arr, low, high);
            quickSortfunc(arr, low, pIndex - 1);
            quickSortfunc(arr, pIndex + 1, high);
        }
    }
    
    static int partition(int arr[], int low, int high) {
        int i = low;
        int pivot = arr[low];
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 

        System.out.print("Enter the size of array: ");
        int size= sc.nextInt();

        int arr[]= new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        QuickSort.quickSortfunc(arr, 0, size-1);

        System.out.print("Sorted array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
