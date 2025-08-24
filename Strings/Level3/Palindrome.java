import java.util.*;

class Palindrome {
    public static boolean isPalindrome1(String s){
        int i=0,j=s.length()-1;
        while(i<j){ if(s.charAt(i)!=s.charAt(j)) return false; i++;j--; }
        return true;
    }
    public static boolean isPalindrome2(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindrome2(s,i+1,j-1);
    }
    public static boolean isPalindrome3(String s){
        char[] a=s.toCharArray();
        String rev="";
        for(int i=s.length()-1;i>=0;i--) rev+=s.charAt(i);
        return s.equals(rev);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String t=sc.nextLine();
        System.out.println("Logic1: "+isPalindrome1(t));
        System.out.println("Logic2: "+isPalindrome2(t,0,t.length()-1));
        System.out.println("Logic3: "+isPalindrome3(t));
    }
}
