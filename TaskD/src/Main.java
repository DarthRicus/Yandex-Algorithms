import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] originalField = new char[10][10];
        char[][] answerField = new char[8][8];
        String[] linesOfField = new String[8];
        for (int i = 0; i < 8; i++) {
            linesOfField[i] = scanner.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            originalField[0][i] = '!';
            originalField[i][0] = '!';
            originalField[9][i] = '!';
            originalField[i][9] = '!';
        }
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                originalField[i][j] = linesOfField[i - 1].charAt(j - 1);
                answerField[i-1][j-1] = '*';
            }
        }
        int[] shiftsB = new int[]{1, 1, -1, -1, 1,-1,-1,1};
        int[] shiftsR = new int[]{1,0,-1,0,0,1,0,-1};
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if(linesOfField[i - 1].charAt(j - 1) == 'R'){
                    answerField[i - 1][j - 1] = 'R';
                    for (int k = 0; k < 8; k += 2) {
                        int shifti = shiftsR[k];
                        int shiftj = shiftsR[k+1];
                        boolean flag = true;
                        while(flag == true){
                            if(originalField[i + shifti][j + shiftj] == '*'){
                                answerField[i + shifti - 1][j + shiftj - 1] = 'R';
                                shifti += shiftsR[k];
                                shiftj += shiftsR[k+1];
                            }else{
                                flag = false;
                            }
                        }
                    }
                }
                if(linesOfField[i - 1].charAt(j - 1) == 'B'){
                    answerField[i - 1][j - 1] = 'B';
                    for (int k = 0; k < 8; k += 2) {
                        int shifti = shiftsB[k];
                        int shiftj = shiftsB[k+1];
                        boolean flag = true;
                        while(flag == true){
                            if(originalField[i + shifti][j + shiftj] == '*'){
                                answerField[i + shifti - 1][j + shiftj - 1] = 'B';
                                shifti += shiftsB[k];
                                shiftj += shiftsB[k+1];
                            }else{
                                flag = false;
                            }
                        }
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(answerField[i][j] == '*')
                    answer++;
            }
        }
        System.out.println(answer);
    }
}