import java.util.Scanner;

public class Practical01 {

    // Method to find the maximum value in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the minimum value in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Declare and initialize the array
        int[] arr = new int[n];
        
        // Input elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Find maximum and minimum values
        int max = findMax(arr);
        int min = findMin(arr);
        
        // Calculate and print the difference
        int difference = max - min;
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }
}
