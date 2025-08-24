import java.util.*;

class RockPaperScissors {
    public static String getComputerChoice() {
        String[] options={"rock","paper","scissors"};
        return options[(int)(Math.random()*3)];
    }
    public static String getWinner(String user,String comp) {
        if(user.equals(comp)) return "Draw";
        if(user.equals("rock") && comp.equals("scissors")) return "User";
        if(user.equals("scissors") && comp.equals("paper")) return "User";
        if(user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<n;i++) {
            System.out.print("Choose rock/paper/scissors: ");
            String user=sc.next();
            String comp=getComputerChoice();
            String winner=getWinner(user,comp);
            System.out.println("Computer chose: "+comp+" | Winner: "+winner);
            if(winner.equals("User")) userWins++;
            else if(winner.equals("Computer")) compWins++;
        }
        System.out.println("User Wins: "+userWins+" Computer Wins: "+compWins);
        double total=userWins+compWins;
        if(total>0) {
            System.out.println("User %: "+(userWins*100/total));
            System.out.println("Computer %: "+(compWins*100/total));
        }
    }
}
