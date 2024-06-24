package bot;
import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Print a greeting and request the user's name
        greet("SimpleBot", "2024");

        // Read and print the user's name
        askName();

        // Guess user's age
        guessAge();

        // Count from 0 to n
        count();

        // Test the user's programming knowledge
        test();

        // End the program
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.print("Please, tell me your name: ");
    }

    static void askName() {
        String name = scanner.nextLine();
        System.out.println("It's nice to meet you, " + name + "!");
    }

    static void guessAge() {
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
        // Print the user's age
        System.out.println("Your age is " + age + "; not bad, right?");
    }

    static void count() {
        System.out.println("Now, I will prove to you that I can count to any number you want.");

        // Read user input and count to the number starting from 0
        System.out.print("Please enter a number for me to count to: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        int answer = 0;
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        while (answer != 2) {
            answer = scanner.nextInt();
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
