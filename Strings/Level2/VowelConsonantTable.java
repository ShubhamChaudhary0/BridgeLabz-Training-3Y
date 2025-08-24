import java.util.Scanner;

class VowelConsonantTable {
    public static String classify(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            char low = Character.toLowerCase(c);
            if ("aeiou".indexOf(low) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyze(String s) {
        String[][] table = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            table[i][0] = String.valueOf(s.charAt(i));
            table[i][1] = classify(s.charAt(i));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();

        String[][] res=analyze(s);
        System.out.println("Char\tType");
        for (String[] row:res) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
}
