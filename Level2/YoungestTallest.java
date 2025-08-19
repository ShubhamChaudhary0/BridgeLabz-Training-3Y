import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int youngestAge = Integer.MAX_VALUE, tallestHeight = Integer.MIN_VALUE;
        int youngestIndex = -1, tallestIndex = -1;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter age of person " + i + ": ");
            int age = sc.nextInt();
            System.out.print("Enter height of person " + i + ": ");
            int height = sc.nextInt();

            if (age < youngestAge) {
                youngestAge = age;
                youngestIndex = i;
            }
            if (height > tallestHeight) {
                tallestHeight = height;
                tallestIndex = i;
            }
        }
        System.out.println("Youngest person is Person " + youngestIndex + " (Age " + youngestAge + ")");
        System.out.println("Tallest person is Person " + tallestIndex + " (Height " + tallestHeight + ")");
        sc.close();
    }
}
