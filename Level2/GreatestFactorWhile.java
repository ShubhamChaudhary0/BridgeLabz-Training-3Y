import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1, greatest = 1;
        while (i < n) {
            if (n % i == 0) greatest = i;
            i++;
        }
        System.out.println("Greatest factor of " + n + " is " + greatest);
        sc.close();
    }
}
