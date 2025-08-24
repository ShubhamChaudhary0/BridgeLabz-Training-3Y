import java.util.*;

class FreqChars {
    public static String[][] frequency(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        ArrayList<String[]> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c]>0){
                list.add(new String[]{""+c,""+freq[c]});
                freq[c]=0;
            }
        }
        return list.toArray(new String[0][0]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String t=sc.nextLine();
        String[][] res=frequency(t);
        System.out.println("Char | Freq");
        for(String[] r:res) System.out.println(r[0]+" -> "+r[1]);
    }
}
