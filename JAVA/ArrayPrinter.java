import java.util.Scanner;

public class ArrayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Print 1-D int array
                int[] arr1D = {1, 2, 3, 4, 5};
                System.out.println("1-D int array: " + java.util.Arrays.toString(arr1D));
                break;
            case 2:
                // Print 2-D int array
                int[][] arr2D = {{1, 2}, {3, 4}, {5, 6}};
                System.out.println("2-D int array:");
                for (int[] row : arr2D) {
                    System.out.println(java.util.Arrays.toString(row));
                }
                break;
            case 3:
                // Print 3-D int array
                int[][][] arr3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
                System.out.println("3-D int array:");
                for (int[][] matrix : arr3D) {
                    for (int[] row : matrix) {
                        System.out.println(java.util.Arrays.toString(row));
                    }
                    System.out.println();
                }
                break;
            default:
                // Invalid choice
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
