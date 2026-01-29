import java.util.Scanner;
import static java.lang.System.exit;

public class Main {
    public static void main() {
        System.out.println("Welcome to Console Hangman game!");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Now, " + username + ", do you know the rules of Hangman?");

        boolean dontKnowTheHangmanRules = true;
        while (dontKnowTheHangmanRules) {
            System.out.println("Write: 0 for NO, 1 for YES");

            String knowRules = scanner.nextLine();

            int knowRulesYesNo = 2;
            if (knowRules.equals("0") || knowRules.equals("1")) {
                knowRulesYesNo = Integer.parseInt(knowRules);
            } else {
                System.out.println("Invalid answer. Provide 0 for NO and 1 for YES");
                continue;
            }

            if (knowRulesYesNo == 0) {
                System.out.println("Hangman is a word-guessing game. Our board computer picks a random word.\n" +
                        "Your task is to guess it within 11 attempts. With each attempt, you provide a letter.\n" +
                        "For each incorrect guess, a part of a stick figure is drawn on the gallows.\n" +
                        "For each correct guess, the letter appears in its place within the word.\n" +
                        "The game ends when either the word is completely guessed or the hangman drawing is completed\n" +
                        "(resulting in a loss).");
                System.out.println("Are rules clear?");
                System.out.println("Write: 0 for NO, 1 for YES");
                String understandable = scanner.nextLine();

                int understood = 2;
                if (understandable.equals("0") || understandable.equals("1")) {
                    understood = Integer.parseInt(understandable);
                } else {
                    System.out.println("Invalid answer. Provide 0 for NO and 1 for YES");
                    continue;
                }

                if (understood == 0) {
                    System.out.println("Check this resource: https://en.wikipedia.org/wiki/Hangman_(game)\n" +
                            "for a better understanding and come back, when you're ready! :)");
                    System.exit(0);
                } else if (understood == 1){
                    System.out.println("Perfect! Time to play!");
                    dontKnowTheHangmanRules = false;
                }
            } else if (knowRulesYesNo == 1) {
                System.out.println("Perfect! Time to play!");
                dontKnowTheHangmanRules = false;
            } else {
                System.out.println("Invalid answer. Provide 0 for NO and 1 for YES");
            }
        }
        RandomWord word = new RandomWord();
        System.out.println(word.getWord());
/*        Hangman hangman = new Hangman();
        System.out.println(hangman.getHangman());*/

        scanner.close();
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}
