package IDoperation;

import java.util.Scanner;

public class search {
     public static void main(String[] args) {
        // Create an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Get the element to search for from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        // Call the search function
        int index = search(numbers, target);

        // Check if the element was found
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Search function to find the index of the target element in the array
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}
