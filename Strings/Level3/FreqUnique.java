import java.util.*;

class FreqUnique {
    public static char[] unique(String s){
        ArrayList<Character> u=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!u.contains(c)) u.add(c);
        }
        char[] arr=new char[u.size()];
        for(int i=0;i<u.size();i++) arr[i]=u.get(i);
        return arr;
    }
    public static String[][] freqUnique(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        char[] u=unique(s);
        String[][] res=new String[u.length][2];
        for(int i=0;i<u.length;i++){
            res[i][0]=""+u[i];
            res[i][1]=""+freq[u[i]];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String t=sc.nextLine();
        String[][] res=freqUnique(t);
        System.out.println("Char | Freq");
        for(String[] r:res) System.out.println(r[0]+" -> "+r[1]);
    }
}
