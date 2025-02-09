import java.util.Scanner;

public class MaximumElementInArray {
    public static void findMax(int a[], int size){
        int max= a[0];
        for(int i=0; i<size; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximun element is: " + max);
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

        MaximumElementInArray.findMax(arr, size);

    }
}
