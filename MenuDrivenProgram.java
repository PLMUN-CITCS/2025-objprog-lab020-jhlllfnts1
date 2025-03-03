import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                handleMenuChoice(choice, scanner);
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Displays the menu options
    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
    }

    // Handles user choice
    private static void handleMenuChoice(int choice, Scanner scanner) {
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting the program. Goodbye!");
            scanner.close();
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    // Displays a greeting message
    private static void greetUser() {
        System.out.println("Hello! Hope you have a great day!");
    }

    // Checks if a number is even or odd
    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
        }
    }
}