import java.util.ArrayList;
import java.util.Arrays;

public class WordChecker {
    private String underscoredWord;
    private ArrayList<String> charactersUsed = new ArrayList<>();

    public String getUnderscoredWord() {
        return underscoredWord;
    }

    public String setUnderscoredWord(String wordChecked) {
        underscoredWord = "_ ".repeat(wordChecked.length());
        return underscoredWord;
    }

    public String getCharactersUsed() {
        return String.join(" ", charactersUsed);
    }

    public boolean isCharacterUsed(String character) {
        return charactersUsed.contains(character.toUpperCase());
    }

    public ArrayList<String> addCharactersUsed(String character, int iteration) {
        charactersUsed.add(character.toUpperCase());
        return charactersUsed;
    }

    public String wordShowedToUser(String character, String wordChecked) {
        int wordLength = wordChecked.length();

        String[] manipulatedWord = underscoredWord.split(" ");
        String[] wordBeingChecked = wordChecked.split("");

        for (int i = 0; i < wordLength; i++) {
            if (wordBeingChecked[i].equals(character)) {
                manipulatedWord[i] = character;
            }
        }
        underscoredWord = String.join(" ", manipulatedWord);
        return underscoredWord;
    }
}
