import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = scanner.nextInt();
        scanner.nextLine();
        String stringOfNumbers = scanner.nextLine();
        String[] numbers = stringOfNumbers.split(" ");
        StringBuilder answer = new StringBuilder("");
        boolean isOdd = false;
        for (int i = 0; i < amountOfNumbers - 1; i++) {
            long currentNumber = Long.parseLong(numbers[i]);
            long nextNumber = Long.parseLong(numbers[i+1]);

        }
        System.out.println(answer);
    }
}