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

        // Guess user's age
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders after dividing your age by 3, 5 and 7.");
        System.out.print("Please, enter the first remainder after dividing your age by 3: ");
        int remainder3 = scanner.nextInt();
        System.out.print("Please, enter the second remainder after dividing your age by 5: ");
        int remainder5 = scanner.nextInt();
        System.out.print("Please, enter the third remainder after dividing your age by 7: ");
        int remainder7 = scanner.nextInt();
        // Calculate age
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println(name + ", your age is " + age + "; not bad, right?");

        System.out.println("Now, I will prove to you that I can count to any number you want.");

        // Read user input and count to the number starting from 0
        System.out.print("Please enter a number for me to count to: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");

        scanner.close();
    }
}
