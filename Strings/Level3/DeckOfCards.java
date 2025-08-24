import java.util.*;

class DeckOfCards {
    static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public static String[] initDeck(){
        String[] deck=new String[suits.length*ranks.length];
        int idx=0;
        for(String s:suits) for(String r:ranks) deck[idx++]=r+" of "+s;
        return deck;
    }
    public static void shuffle(String[] deck){
        for(int i=0;i<deck.length;i++){
            int r=i+(int)(Math.random()*(deck.length-i));
            String tmp=deck[i];deck[i]=deck[r];deck[r]=tmp;
        }
    }
    public static String[][] distribute(String[] deck,int n,int players){
        if(n%players!=0) return null;
        int cardsEach=n/players;
        String[][] res=new String[players][cardsEach];
        int idx=0;
        for(int i=0;i<players;i++)
            for(int j=0;j<cardsEach;j++)
                res[i][j]=deck[idx++];
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int p=sc.nextInt();
        System.out.print("Enter number of cards to distribute: ");
        int n=sc.nextInt();
        String[] deck=initDeck();
        shuffle(deck);
        String[][] res=distribute(deck,n,p);
        if(res==null){System.out.println("Cannot distribute equally.");return;}
        for(int i=0;i<p;i++){
            System.out.println("Player "+(i+1)+": "+Arrays.toString(res[i]));
        }
    }
}
