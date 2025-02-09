import java.util.Scanner;

public class SelectionSort {
    public static void selectionSortfunc(int a[], int size){
        for(int i = 0; i< size-1; i++){
            int minIndex=i;
            for(int j=i+1; j<size; j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = a[minIndex];
                a[minIndex]=a[i];
                a[i]= temp;
            }
        }
        System.out.println("Sorted array is: ");
        for(int i=0; i<size; i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 

        System.out.print("Enter the size of array: ");
        int size= sc.nextInt();

        int arr[]= new int[10];

        System.out.print("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        SelectionSort.selectionSortfunc(arr, size);

        sc.close();
    }
}
