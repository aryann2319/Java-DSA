import java.util.Scanner;

public class LinearSearch {
    public static int LinearSearchfucn(int a[], int size, int key){
        for(int i=0; i<size; i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter the element that you want to search: ");
        int key= sc.nextInt();

        int result = LinearSearch.LinearSearchfucn(arr, size, key);

        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position "+(result+1));
        }
    }
}
