import java.util.Scanner;

public class ArrayElementDeletion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size= sc.nextInt();

        int arr[]= new int[10];

        System.out.print("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        System.out.print("Enter the postion where you want to delete: ");
        int pos= sc.nextInt();

        for(int i=pos-1; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        size--;

        System.out.println("Array after deletion is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
