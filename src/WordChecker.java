public class WordChecker {
    private String underscoredWord;
    private String[] charactersUsed;

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

    public String[] addCharactersUsed(String character, int iteration) {
        charactersUsed[iteration - 1] = character;
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

        return String.join(" ", manipulatedWord);
    }
}
