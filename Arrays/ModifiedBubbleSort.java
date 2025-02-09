import java.util.Scanner;

public class ModifiedBubbleSort {
    public static void sorting(int a[], int size){
        for(int i=0; i < size-1; i++){
            int swapped=0;
            for(int j=0; j < size-i-1; j++){
                if(a[j+1] < a[j]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                    swapped=1;
                }
            }
            if(swapped==0){
                break;
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

        ModifiedBubbleSort.sorting(arr, size);

        sc.close();
    }
}
