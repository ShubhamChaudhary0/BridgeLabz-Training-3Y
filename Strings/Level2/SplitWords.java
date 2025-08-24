import java.util.Scanner;

class SplitWords {
    public static int getLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }

    public static String[] customSplit(String s) {
        int n = getLength(s);
        int wordCount = 1;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int index = 0, start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom Split:");
        for (String w : custom) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : builtin) System.out.println(w);

        System.out.println("Arrays match? " + compareArrays(custom, builtin));
    }
}
