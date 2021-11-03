public class WritingWords {
    private int amountRows, amountCharacters, amountWords;
    private boolean continueStatement = false;
    private String longestWord;


    public WritingWords() {
        amountRows = 0;
        amountCharacters = 0;
        amountWords = 0;
        longestWord = "";
    }

    public int getRow() {
        return amountRows;
    }

    public void addRow() {
        amountRows = amountRows + 1;
    }


    public void hasStopAppeared(String inputText) {
        String thisWillStop = inputText;
        String stopIsStopping[] = thisWillStop.split(" ");
        //if (inputText.equals("Stop")||inputText.equals("stop")) {
        //   System.out.println("The word Stop has been detected.");
        //    continueStatement = true;

        for (int i = 0; i < stopIsStopping.length; i++) {
            if (stopIsStopping[i].equals("Stop") || stopIsStopping[i].equals("stop")) {
                System.out.println("The word Stop has been detected.");
                continueStatement = true;
            } else {
                if(i<=0){
                    addRow();
                }
                addCharacter(stopIsStopping[i]);
                addWords(stopIsStopping[i]);
                saveLongestWord(stopIsStopping[i]);
            }
        }

    }

    private void addWords(String inputText) {
        String addMoreWords = inputText;
        String addingWords[] = addMoreWords.split(" ");
        for (int i = 0; i < addingWords.length; i++) {
            amountWords++;
        }
    }

    private void saveLongestWord(String inputText) {
        String isThisLongest = inputText;
        String saveLongestWord[] = isThisLongest.split(" ");
        for (int i = 0; i < saveLongestWord.length; i++) {
            if (longestWord.length() < saveLongestWord[i].length()) {
                longestWord = saveLongestWord[i];
            }
        }
    }

    public int getCharacter() {
        return amountCharacters;
    }

    public void addCharacter(String inputText) {
        amountCharacters = amountCharacters + inputText.length();
    }

    public boolean getContinue() {
        return continueStatement;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public int getAmountOfWords() {
        return amountWords;
    }
}
