import java.util.Scanner;

class TrimString {
    public static String customTrim(String s) {
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        return s.substring(start,end+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String s=sc.nextLine();

        String trimmed=customTrim(s);
        System.out.println("Custom Trim: ["+trimmed+"]");
        System.out.println("Built-in Trim: ["+s.trim()+"]");
    }
}
