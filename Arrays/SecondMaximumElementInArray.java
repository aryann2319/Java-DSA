import java.util.Scanner;

public class SecondMaximumElementInArray {
    public static void secondMax(int a[], int size){
        int max= a[0];
        int secondMax=0;
        for(int i=1; i<size; i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            if(a[i]!=max && a[i]>secondMax){
                secondMax=a[i];
            }
        }
        System.out.println("Second Maximun element is: " + secondMax);
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

        SecondMaximumElementInArray.secondMax(arr, size);

    }
}
