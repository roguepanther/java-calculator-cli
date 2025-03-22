import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Filip's Java Calculator!");
        userMenu();
        calculator();
    }

    // Text Interface for the calculator
    public static void userMenu() {

        System.out.println("Choose an operation: ");
        System.out.println("1. Add ");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }


    // Let's design the Calculator Menu Display
    public static void calculator() {
        int userChoice;
        int a, b, result;
        double division;
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();
        // Handle getting the numbers from the user
        while(userChoice != 5) {
                System.out.print("Enter first number: ");
                a = scanner.nextInt();
                System.out.print("Enter second number: ");
                b = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        result = add(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = subtract(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = multiply(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        // Let's add some error handling for 0 division
                        division = divide(a, b);
                        System.out.println("Result: " + division);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. try again!");
                        break;
                }
            userMenu();
            userChoice = scanner.nextInt();
        }



    }
    // Define methods for mathematical calculations

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }


    // Tackle the use case when the result can be a double

    public static double divide(int a, int b) {
        try {
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

}