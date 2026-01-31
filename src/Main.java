import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                    System.out.println("Invalid answer.");
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
                System.out.println("Invalid answer.");
            }
        }
        RandomWord word = new RandomWord();
        String randomWord = word.setWord();

        WordChecker wordChecker = new WordChecker();
        wordChecker.setUnderscoredWord(randomWord);

        int attempts = 50;
        int wrongGuesses = 0;
        String underscoredWord = "";
        Hangman hangman = new Hangman();
        for (int i = 0; i < attempts; i++) {
            underscoredWord = wordChecker.getUnderscoredWord();
            System.out.println("Your word for guessing: " + underscoredWord);
            System.out.println("Provide a letter: ");

            String character = "";

            Pattern pattern = Pattern.compile("[a-zA-Z]");

            boolean isCharacterInvalid = true;
            while(isCharacterInvalid) {
                character = scanner.nextLine().toLowerCase();
                Matcher matcher = pattern.matcher(character);
                boolean ifMatches = matcher.matches();
                if (ifMatches) {
                    if (wordChecker.isCharacterUsed(character)) {
                        System.out.println("This character was used, provide another one!");
                    } else {
                        isCharacterInvalid = false;
                    }
                } else {
                    System.out.println("Invalid input. Provide a letter: ");
                }
            }
            String wordBeforeGuess = wordChecker.getUnderscoredWord();

            String charactersUsed = String.join("", wordChecker.addCharactersUsed(character, i));
            System.out.println("Characters used: " + charactersUsed);

            String guessedWord = wordChecker.wordShowedToUser(character, randomWord);

            if (wordBeforeGuess.equals(guessedWord)) {
                System.out.println("Ooops! Letter not found in word!");
                System.out.println(hangman.getHangman(wrongGuesses));
                wrongGuesses++;
            } else {
                System.out.println("Nice, you guessed one letter!");
            }

            WinChecker check = new WinChecker();
            if (check.checkForWin(wordChecker.getUnderscoredWord(),randomWord)) {
                System.out.println("Yayyy! You won!");
                break;
            }

            if (wrongGuesses == 11) {
                System.out.println("Game over!");
                System.out.println("The word was: " + randomWord);
                System.out.println("Good luck next time!");
                break;
            }
        }
        scanner.close();
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
}
