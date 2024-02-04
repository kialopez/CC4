import java.util.Scanner;

public class RMSAddressCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of dimensions
        System.out.print("Enter the number of dimensions: ");
        int numDimensions = scanner.nextInt();

        // Get the upper bound of each dimension
        int[] upperBounds = new int[numDimensions];
        for (int i = 0; i < numDimensions; i++) {
            System.out.print("Enter the upper bound of dimension " + (i + 1) + ": ");
            upperBounds[i] = scanner.nextInt();
        }

        // Get the address to look for in each dimension
        int[] addresses = new int[numDimensions];
        for (int i = 0; i < numDimensions; i++) {
            System.out.print("Enter the address to look for in dimension " + (i + 1) + ": ");
            addresses[i] = scanner.nextInt();
        }

        // Calculate RMS address
        double sumOfSquares = 0;
        for (int i = 0; i < numDimensions; i++) {
            sumOfSquares += Math.pow(addresses[i], 2);
        }

        double rmsAddress = Math.sqrt(sumOfSquares);

        System.out.println("RMS Address: " + rmsAddress);

        // Close the scanner
        scanner.close();
    }
}