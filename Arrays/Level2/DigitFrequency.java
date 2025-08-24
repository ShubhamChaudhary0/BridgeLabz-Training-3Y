import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Frequency array for digits 0-9
        int[] frequency = new int[10];

        // Handle negative numbers
        number = Math.abs(number);

        // Extract digits and count frequencies
        while (number > 0) {
            int digit = (int)(number % 10); // Get last digit
            frequency[digit]++;             // Increase count for this digit
            number /= 10;                   // Remove last digit
        }

        // Display digit frequencies
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " -> " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
