import java.util.Scanner;

public class SubstringCompare {
    public static String substringCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = substringCharAt(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Manual substring: " + manual);
        System.out.println("Built-in substring: " + builtin);
        System.out.println("Are they equal? " + compareCharAt(manual, builtin));
    }
}
