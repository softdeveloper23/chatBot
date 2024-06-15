package bot;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        // Print a greeting
        System.out.println("Hello! My name is Simple Bot.");
        System.out.println("I was created in 2024.");

        // Request the user's name
        System.out.print("Please, tell me your name: ");

        // Read user's name
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Print user's name
        System.out.println("It's nice to meet you, " + name + "!");

    }
}
