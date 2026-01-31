public class WinChecker {
    public boolean checkForWin(String underscoredWord, String randomWord) {
        String[] testableUnderscoredWord = underscoredWord.split(" ");
        String testableWord = String.join("", testableUnderscoredWord);
        return testableWord.equals(randomWord);
    }
}
