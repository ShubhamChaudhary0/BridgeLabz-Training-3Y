import java.util.*;

public class NumberChecker1 {
    static int countDigits(long n){ return String.valueOf(Math.abs(n)).length(); }
    static int[] toDigits(long n){
        String s = String.valueOf(Math.abs(n));
        int[] d = new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    // Using common definition: DUCK = contains at least one '0' (ignoring leading zeros)
    static boolean isDuck(long n){
        String s = String.valueOf(Math.abs(n));
        for(int i=1;i<s.length();i++) if(s.charAt(i)=='0') return true; // ignore leading
        return false;
    }
    static boolean isArmstrong(long n){
        int[] d = toDigits(n);
        int k = d.length;
        long sum=0;
        for(int v: d) sum += Math.pow(v, k);
        return sum==Math.abs(n);
    }
    static int[] largestAndSecondLargest(int[] digits){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int v: digits){
            if(v>first){ second=first; first=v; }
            else if(v>second && v!=first){ second=v; }
        }
        return new int[]{first, (second==Integer.MIN_VALUE?first:second)};
    }
    static int[] smallestAndSecondSmallest(int[] digits){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int v: digits){
            if(v<first){ second=first; first=v; }
            else if(v<second && v!=first){ second=v; }
        }
        return new int[]{first, (second==Integer.MAX_VALUE?first:second)};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        int[] digits = toDigits(n);

        System.out.println("Digit count: " + countDigits(n));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck? " + (isDuck(n)?"Yes":"No"));
        System.out.println("Armstrong? " + (isArmstrong(n)?"Yes":"No"));

        int[] big = largestAndSecondLargest(digits);
        int[] small = smallestAndSecondSmallest(digits);
        System.out.println("Largest: " + big[0] + ", Second Largest: " + big[1]);
        System.out.println("Smallest: " + small[0] + ", Second Smallest: " + small[1]);
    }
}
