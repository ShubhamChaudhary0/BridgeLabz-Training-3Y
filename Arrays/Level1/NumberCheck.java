import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Define an array of 5 integers
        int[] numbers = new int[5];

        // Step 2: Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");

        // Step 3: Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is positive and even.");
                } else {
                    System.out.println("Number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is negative.");
            } else {
                System.out.println("Number is zero.");
            }
        }

        // Step 4: Compare first and last elements
        System.out.println("\n--- First and Last Element Comparison ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        }

        scanner.close();
    }
}
