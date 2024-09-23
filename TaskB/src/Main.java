import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int awayOrHome = scanner.nextInt();
        String[] match1Goals= s1.split(":");
        String[] match2Goals = s2.split(":");
        int match1Team1Goals = Integer.parseInt(match1Goals[0]);
        int match1Team2Goals = Integer.parseInt(match1Goals[1]);
        int match2Team1Goals = Integer.parseInt(match2Goals[0]);
        int match2Team2Goals = Integer.parseInt(match2Goals[1]);
        if(awayOrHome == 1){
            int goalsToScore = (match1Team2Goals + match2Team2Goals) - (match1Team1Goals + match2Team1Goals);
            if(goalsToScore < 0){
                System.out.println(0);
            }else if(goalsToScore == 0){
                if(match2Team1Goals > match1Team2Goals){
                    System.out.println(0);
                }else{
                    System.out.println(1);
                }
            }else if(goalsToScore > 0){
                if(goalsToScore + match2Team1Goals > match1Team2Goals){
                    System.out.println(goalsToScore);
                } else {
                    System.out.println(goalsToScore + 1);
                }
            }
        }else{
            int goalsToScore = (match1Team2Goals + match2Team2Goals) - (match1Team1Goals + match2Team1Goals);
            if(goalsToScore < 0){
                System.out.println(0);
            }else if(goalsToScore == 0){
                if(match1Team1Goals > match2Team2Goals){
                    System.out.println(0);
                }else{
                    System.out.println(1);
                }
            }else if(goalsToScore > 0){
                if(match1Team1Goals > match2Team2Goals){
                    System.out.println(goalsToScore);
                }else{
                    System.out.println(goalsToScore + 1);
                }
            }
        }
    }
}
