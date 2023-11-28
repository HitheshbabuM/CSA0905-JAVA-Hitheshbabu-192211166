import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);

        scanner.close();
    }

    private static int findMissingNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return n;
    }
}
