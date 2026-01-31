public class Hangman {
    private static String[] hangman = {"+--------+\n|/       |\n|        0\n|       /|\\\n|      / | \\\n|       / \n|      /  \n|\n+===========","+--------+\n|/       |\n|        0\n|       /|\\\n|      / | \\\n|       / \\\n|      /  \n|\n+===========", "+--------+\n|/       |\n|        0\n|       /|\\\n|      / | \\\n|       / \\\n|      /   \\\n|\n+==========="};

    public static String getHangman(int i) {
        return hangman[i];
    }

    public static void main() {
        System.out.println(getHangman(0));
    }
}