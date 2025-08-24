import java.util.*;

class FreqNested {
    public static String[][] frequency(String s){
        char[] ch=s.toCharArray();
        int[] freq=new int[ch.length];
        for(int i=0;i<ch.length;i++) freq[i]=-1;
        for(int i=0;i<ch.length;i++){
            if(freq[i]==-1){
                int c=1;
                for(int j=i+1;j<ch.length;j++){
                    if(ch[i]==ch[j]){c++;freq[j]=0;}
                }
                freq[i]=c;
            }
        }
        ArrayList<String[]> list=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            if(freq[i]>0) list.add(new String[]{""+ch[i],""+freq[i]});
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
