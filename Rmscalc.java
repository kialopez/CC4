import java.util.Scanner;

public class Rmscalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseAddress = getUserInput("Enter Base Address: ", scanner);
        int weight = getUserInput("Enter Weight: ", scanner);
        int dimensions = getUserInput("Enter number of Dimensions: ", scanner);

        int[] dimensionsArray = getArrayInput("Upper Bound", dimensions, scanner);
        int[] elementArray = getArrayInput("Array Index", dimensions, scanner);

        scanner.close();

        int sum = calculateSum(dimensionsArray, elementArray);
        int total = calculateAddress(baseAddress, weight, sum);

        System.out.println("RMS: " + total);
    }

    public static int getUserInput(String message, Scanner scanner) {
        int userInput = 0;

        while (true) {
            try {
                System.out.print(message);
                userInput = Integer.parseInt(scanner.nextLine());

                if (userInput >= 0) {
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a valid integer.");
            }
        }

        return userInput;
    }

    public static int[] getArrayInput(String type, int size, Scanner scanner) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = getUserInput("Enter " + type + " " + (i + 1) + ": ", scanner);
        }

        return array;
    }

    public static int calculateSum(int[] dimensionsArray, int[] elementArray) {
        int sum = 0;

        for (int i = 0; i < dimensionsArray.length; i++) {
            int temp = elementArray[i];

            for (int j = i + 1; j < dimensionsArray.length; j++) {
                temp *= dimensionsArray[j];
            }

            sum += temp;
        }

        return sum;
    }

    public static int calculateAddress(int baseAddress, int weight, int sum) {
        return baseAddress + (weight * sum);
    }
}
