public class RandomWord {
    private final String[] words = {
            "apple", "beach", "chair", "dance", "eagle", "flame", "grape", "house",
            "image", "juice", "knife", "lemon", "mouse", "night", "ocean", "peace",
            "queen", "river", "stone", "tiger", "uncle", "voice", "water", "yacht",
            "zebra", "bread", "cloud", "dream", "earth", "field", "grass", "heart",
            "island", "jungle", "light", "magic", "north", "paint", "quiet", "radio",
            "smile", "table", "under", "valley", "wheel", "yellow", "bridge", "castle",
            "doctor", "engine", "forest", "garden", "hammer", "insect", "jacket", "kitchen",
            "ladder", "monkey", "needle", "orange", "planet", "rabbit", "silver", "temple",
            "umbrella", "village", "window", "animal", "basket", "button", "candle", "dragon",
            "eleven", "finger", "frozen", "guitar", "hockey", "indent", "jigsaw", "kettle",
            "laptop", "market", "number", "office", "pencil", "rocket", "school", "spring",
            "summer", "winter", "travel", "turkey", "update", "volume", "wizard", "yogurt",
            "artist", "bottle", "camera", "desert", "energy", "flower", "global", "helper"
    };

    private String randomWord;

    public String getWord() {
        return randomWord;
    }

    public String setWord() {
        int randomNum = (int) (Math.random() * 100);
        return randomWord = words[randomNum];
    }
}