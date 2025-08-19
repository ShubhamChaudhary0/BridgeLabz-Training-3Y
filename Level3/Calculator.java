import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input numbers
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Step 2: Take operator input
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Step 3: Perform calculation using switch
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
