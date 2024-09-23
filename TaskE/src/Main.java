import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToRead = scanner.nextLine();
        String[] dividedString = stringToRead.split(" ");
        String n = dividedString[0];
        BigInteger k = new BigInteger(dividedString[1]);
        int d = Integer.parseInt(dividedString[2]);
        if(k.compareTo(new BigInteger(n+9)) == 1){
            System.out.println(-1);
            return;
        }
        boolean flagFirstIteration = false;
        for (int i = 0; i < d; i++) {
            boolean flag = false;
            for (int j = 0; j < 10; j++) {
                BigInteger integerToCheck = new BigInteger(n + j);
                if(integerToCheck.mod(k).equals(new BigInteger("0"))){
                    flagFirstIteration = true;
                    flag = true;
                    n = n + j;
                    if(j == 0){
                        StringBuilder stringToSum = new StringBuilder(n);
                        for (int l = 0; l < d - (i+1); l++) {
                            stringToSum.append(0);
                        }
                        System.out.println(stringToSum);
                        return;
                    }
                    break;
                }
            }
            if(flag == false && flagFirstIteration == true){
                System.out.println(n);
                return;
            } else if(flag == false && flagFirstIteration == false){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(n);
    }
}