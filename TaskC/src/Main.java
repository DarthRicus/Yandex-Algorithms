import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = scanner.nextInt();
        long counter = 0;
        int numberToRead;
        for (int i = 0; i < amountOfNumbers; i++) {
             numberToRead = scanner.nextInt();
            if(numberToRead % 4 == 3 ) {
                counter += (numberToRead / 4 + 2);
            } else{
                counter += (numberToRead / 4 + numberToRead %4 );
            }
        }
        System.out.println(counter);
    }
}