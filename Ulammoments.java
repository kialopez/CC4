import java.util.Scanner;

public class Ulammoments {
    public static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        counter++; // Increment counter
        System.out.println("Deciding what ulam to cook for lunch.");
        counter++; // Increment counter

        String cuisineChoice = "";
        counter++; // Increment counter

        for (; cuisineChoice.equals(""); ) {
            printStep("Decide if Iam really hungry.");
            counter++; // Increment counter
            printStep("Think about the type of ulam I'd like to have.");
            counter++; // Increment counter
            printOptions("Choose an ulam:", "Adobo", "Itlog", "Sinigang");
            counter++; // Increment counter
            System.out.print("Enter choice: ");
            counter++; // Increment counter
            String choice = scanner.nextLine();
            counter++; // Increment counter

            cuisineChoice = processCuisineChoice(choice);
            counter++; // Increment counter
        }

        printStep("Plan a delicious " + cuisineChoice + " ulam to cook.");
        counter++; // Increment counter

        while (counter < 50 || counter > 75) {
            // Simulate waiting time
            counter++; // Increment counter
        }

        printSteps("Gather the necessary ingredients and cooking utensils.",
                "Start preparing and cooking the chosen dish.",
                "Enjoy your homemade ulam for lunch.",
                "If you liked the dish, consider adding it to your favorites.",
                "Clean up the kitchen after cooking.",
                "Finish the food and continue whatever Im doing with a happy tummy.");
                counter++; // Increment counter

        scanner.close();
        counter++; // Increment counter
        
        System.out.println(counter); // Print the counter at the end
        counter++; // Increment counter
    }

    private static void printStep(String step) {
        System.out.println("\n" + step);
        counter++; // Increment counter
    }

    private static void printOptions(String prompt, String... options) {
        System.out.println(prompt);
        counter++; // Increment counter
        for (int i = 0; i < options.length; i++) {
            System.out.println("    " + (char) ('a' + i) + ". " + options[i]);
            counter++; // Increment counter
        }
    }

    private static String processCuisineChoice(String choice) {
        if (choice.equals("a")) {
            counter++; // Increment counter
            return "Adobo";
        } else if (choice.equals("b")) {
            counter++; // Increment counter
            return "Itlog";
        } else if (choice.equals("c")) {
            counter++; // Increment counter
            return "Sinigang";
        } else {
            System.out.println("NOT ULAM!");
            counter++; // Increment counter
            return "";
        }
    }

    private static void printSteps(String... steps) {
        for (String step : steps) {
            System.out.println(step);
            counter++; // Increment counter for each step
        }
    }
}
