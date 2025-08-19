import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum of digits
        int sum = 0;
        int temp = number; // copy of number for digit extraction

        // Step 3: Extract digits and calculate sum
        while (temp > 0) {
            int digit = temp % 10;  // get last digit
            sum += digit;           // add digit to sum
            temp = temp / 10;       // remove last digit
        }

        // Step 4: Check Harshad condition
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is Not a Harshad Number");
        }

        sc.close();
    }
}
