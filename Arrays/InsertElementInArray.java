import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in array: ");
        int size = scanner.nextInt();
        
        int[] a = new int[10]; 
        
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the position where you want to insert: ");
        int position = scanner.nextInt();
        
        System.out.print("Enter the value that you want to insert: ");
        int value = scanner.nextInt();
        
        for (int i = size - 1; i >= position - 1; i--) {
            a[i + 1] = a[i];
        }
        a[position - 1] = value;
        size++;
        
        System.out.println("Array after insertion is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]);
        }
        
        scanner.close();
    }
}
