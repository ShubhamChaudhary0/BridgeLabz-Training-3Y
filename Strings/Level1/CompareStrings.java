import java.util.Scanner;

public class CompareStrings {
    public static boolean compareCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean manual = compareCharAt(s1, s2);
        boolean builtin = s1.equals(s2);

        System.out.println("Manual compare: " + manual);
        System.out.println("Built-in equals: " + builtin);
    }
}
