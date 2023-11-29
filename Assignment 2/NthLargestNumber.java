import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of N to find the Nth largest number: ");
        int n = scanner.nextInt();

        Arrays.sort(array);

        if (n <= array.length) {
            int nthLargest = array[array.length - n];
            System.out.println(n + "th Largest number: " + nthLargest);
        } else {
            System.out.println("N is out of range for the array.");
        }

        scanner.close();
    }
}
