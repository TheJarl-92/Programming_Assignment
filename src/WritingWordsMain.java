import java.util.Scanner;

public class WritingWordsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WritingWords myWord = new WritingWords();

        System.out.println("Write some words and end the program with the word Stop on a new line.");


        while(true) {
            String inputText = scan.nextLine();
            myWord.hasStopAppeared(inputText);
            if (myWord.getContinue()) {
                System.out.println("You wrote " + myWord.getCharacter() + " character(s) on " + myWord.getRow() + " row(s)" + " and " + myWord.getAmountOfWords() + " number of word(s).");
                System.out.println("Your longest word was: " + myWord.getLongestWord());
                break;

            }
        }
    }
}
