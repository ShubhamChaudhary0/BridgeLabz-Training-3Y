import java.util.*;

class Anagram {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] f1=new int[256], f2=new int[256];
        for(char c:s1.toCharArray()) f1[c]++;
        for(char c:s2.toCharArray()) f2[c]++;
        return Arrays.equals(f1,f2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first text: ");
        String t1=sc.nextLine();
        System.out.print("Enter second text: ");
        String t2=sc.nextLine();
        System.out.println("Anagram? "+isAnagram(t1,t2));
    }
}
