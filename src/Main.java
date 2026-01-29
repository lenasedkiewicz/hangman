import java.util.Scanner;

public class Main {
    public static void main() {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name\n");
        String username = scanner.nextLine();
        System.out.println("Username: " + username);
        Hangman hangman = new Hangman();
        System.out.println(hangman.getHangman());
    }
}
