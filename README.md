# Console Hangman Game

A classic word-guessing game implemented in Java for the console/terminal.

## Description

Console Hangman is a text-based implementation of the traditional Hangman game. The computer selects a random word from a predefined list, and the player must guess it letter by letter within 11 incorrect attempts. With each wrong guess, a part of the hangman figure is drawn on the gallows.

## Features

- Interactive console interface
- Rule explanation for new players
- Input validation for letter guesses
- Visual hangman ASCII art progression
- Tracks used characters
- Random word selection from a diverse word list
- Win/loss detection

## How to Play

1. Run the program
2. Enter your name
3. Indicate whether you know the Hangman rules (0 for NO, 1 for YES)
4. Start guessing letters one at a time
5. Try to complete the word before the hangman is fully drawn (11 wrong guesses)

## Game Rules

- The computer picks a random word
- You have 11 attempts to guess the word
- Each turn, provide a single letter
- Correct guesses reveal the letter's position(s) in the word
- Incorrect guesses add a body part to the hangman drawing
- Win by guessing the complete word
- Lose if the hangman drawing is completed

## Project Structure

- `Main.java` - Main game loop and user interaction
- `RandomWord.java` - Handles random word selection
- `WordChecker.java` - Manages word state and character tracking
- `Hangman.java` - Stores and displays hangman ASCII art stages
- `WinChecker.java` - Checks for win conditions

## Requirements

- Java JDK 8 or higher

## How to Run

```bash
javac Main.java
java Main
```

## Example Gameplay

```
Welcome to Console Hangman game!
What is your name?
> Lena
Now, Lena, do you know the rules of Hangman?
Write: 0 for NO, 1 for YES
> 1
Perfect! Time to play!
Your word for guessing: _ _ _ _ _
Provide a letter:
> a
Characters used: A
Nice, you guessed one letter!
Your word for guessing: a _ _ _ _
```

## License

Free to use and modify for educational purposes.