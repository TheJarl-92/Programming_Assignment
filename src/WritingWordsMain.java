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
                /*Har en break här och i for-loopen. Tyckte det verkade för mycket först men om jag tog från for-loopen
                kunde jag inte räkna ut orden ordentligt. Om jag inte hade break i main metoden så körs programmet
                i oändlighet, eller tills man stoppar det manuellt. Kändes snyggare att avsluta programmet om man väl
                kom till ordet stop.
                 */
            }
        }
    }
}
