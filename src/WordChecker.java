import java.util.Arrays;

public class WordChecker {
    private String underscoredWord;
    private String[] charactersUsed = new String[11];

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
        if (Arrays.asList(charactersUsed).contains(character.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

    public String[] addCharactersUsed(String character, int iteration) {
        charactersUsed[iteration] = character.toUpperCase();
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
