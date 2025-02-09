import java.util.Scanner;

public class BinarySearch {
    public static int search(int a[], int size, int key, int low, int high){
        while(low<=high){
            int mid= (low+high)/2;

            if(key == a[mid]){
                return mid;
            }
            else if(key > a[mid]){
                low = mid+1;
            }
            else{
                high=mid-1;
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

        int result = BinarySearch.search(arr, size, key, 0, size-1);

        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Found at position " + (result+1));
        }
        sc.close();
    }
}
