import java.util.Scanner;

class VowelConsonantCount {
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public static int[] countVowelsConsonants(String s) {
        int v=0,c=0;
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if (isLetter(ch)) {
                if (isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();

        int[] res=countVowelsConsonants(s);
        System.out.println("Vowels: "+res[0]);
        System.out.println("Consonants: "+res[1]);
    }
}
