import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Factors of " + n + ":");
        while (i <= n) {
            if (n % i == 0) System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
