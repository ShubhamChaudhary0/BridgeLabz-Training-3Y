import java.util.Scanner;

class ShortestLongest {
    public static int getLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }

    public static String[] customSplit(String s) {
        int n = getLength(s), wordCount = 1;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String shortest = words[0], longest = words[0];

        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
