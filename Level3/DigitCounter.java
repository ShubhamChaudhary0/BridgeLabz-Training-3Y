import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize counter
        int count = 0;

        // Handle 0 explicitly (since loop won't run for 0)
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Loop until number becomes 0
            while (number != 0) {
                // Step 4: Remove last digit
                number = number / 10;

                // Step 5: Increase counter
                count++;
            }
        }

        // Step 6: Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
