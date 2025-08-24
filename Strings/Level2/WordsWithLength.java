import java.util.Scanner;

class WordsWithLength {
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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] result = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
