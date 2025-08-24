import java.util.*;

public class NumberChecker3 {
    static int[] toDigits(long n){
        String s=String.valueOf(Math.abs(n));
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    static int[] reverse(int[] a){
        int[] b=a.clone();
        for(int i=0,j=b.length-1;i<j;i++,j--){ int t=b[i]; b[i]=b[j]; b[j]=t; }
        return b;
    }
    static boolean arraysEqual(int[] a,int[]b){
        return Arrays.equals(a,b);
    }
    static boolean isPalindrome(long n){
        int[] d=toDigits(n);
        return arraysEqual(d, reverse(d));
    }
    static boolean isDuck(long n){
        String s=String.valueOf(Math.abs(n));
        for(int i=1;i<s.length();i++) if(s.charAt(i)=='0') return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        int[] d=toDigits(n);
        int[] r=reverse(d);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Reversed: " + Arrays.toString(r));
        System.out.println("Arrays equal? " + arraysEqual(d,r));
        System.out.println("Palindrome? " + (isPalindrome(n)?"Yes":"No"));
        System.out.println("Duck? " + (isDuck(n)?"Yes":"No"));
    }
}
