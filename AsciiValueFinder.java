// This program takes a single character input from the user and prints its ASCII value.
import java.util.Scanner;

public class AsciiValueFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Please enter exactly one character.");
                return;
            }

            char ch = input.charAt(0);
            int asciiValue = ch;
            System.out.printf("The ASCII value of '%c' is: %d%n", ch, asciiValue);
        }
    }
}

