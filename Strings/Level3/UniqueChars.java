import java.util.*;

class UniqueChars {
    public static int length(String s) {
        int c=0;
        try{while(true){s.charAt(c);c++;}}
        catch(Exception e){return c;}
    }
    public static char[] unique(String s) {
        int n = length(s);
        char[] temp = new char[n];
        int idx=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            boolean found=false;
            for(int j=0;j<i;j++) if(s.charAt(j)==ch){found=true;break;}
            if(!found) temp[idx++]=ch;
        }
        return Arrays.copyOf(temp,idx);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String t=sc.nextLine();
        char[] u=unique(t);
        System.out.println("Unique characters:");
        for(char c:u) System.out.print(c+" ");
        System.out.println();
    }
}
