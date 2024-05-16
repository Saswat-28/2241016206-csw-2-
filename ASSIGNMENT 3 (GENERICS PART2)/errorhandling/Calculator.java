package errorhandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the Calculator.");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Result: "+(num1+num2));
                        break;
                    case 2:
                        System.out.println("Result: " +(num1-num2));
                        break;
                    case 3:
                        System.out.println("Result: " +(num1*num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero!");
                        }
                        System.out.println("Result: " + (num1/num2));
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid operation.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

