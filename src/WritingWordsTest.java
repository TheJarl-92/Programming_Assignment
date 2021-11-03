import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WritingWordsTest {
    @Test
    public void testGetRow() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        int actual = myWord.getRow();

        //ASSERT
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddAndGetRow() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        myWord.addRow();
        int actual = myWord.getRow();

        //ASSERT
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd3RowsGet3() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        myWord.addRow();
        myWord.addRow();
        myWord.addRow();
        int actual = myWord.getRow();

        //ASSERT
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetRowsButNotStop() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Stop";
        myWord.hasStopAppeared(inputText);
        int actual = myWord.getRow();

        //ASSERT
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetRowsWithMoreInputsButNotStop() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.hasStopAppeared(inputText);

        inputText = "World";
        myWord.hasStopAppeared(inputText);

        inputText = "Stop";
        myWord.hasStopAppeared(inputText);
        int actual = myWord.getRow();

        //ASSERT
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCharacter() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        int actual = myWord.getCharacter();

        //ASSERT
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testAddAndGetCharacter() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.addCharacter(inputText);
        int actual = myWord.getCharacter();

        //ASSERT
        int expected = 5;
        assertEquals(expected, actual);
    }


    @Test
    public void testGetCharacterAndRowButNotStop() {
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.hasStopAppeared(inputText);

        inputText = "World";
        myWord.hasStopAppeared(inputText);

        inputText = "Stop";
        myWord.hasStopAppeared(inputText);
        int actual = myWord.getCharacter();
        int actual2 = myWord.getRow();

        //ASSERT
        int expected = 10;
        int expected2 = 2;
        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testLongestWord(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.hasStopAppeared(inputText);
        String actual = myWord.getLongestWord();

        //ASSERT
        String expected = "Hello";
        assertEquals(expected, actual);
    }

    //Skriver om denna när jag kom längre för att testa med arrayer.
    @Test
    public void testLongestWord2Inputs(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.hasStopAppeared(inputText);

        //inputText = "The world";
        inputText = "The worldo";
        myWord.hasStopAppeared(inputText);

        String actual = myWord.getLongestWord();

        //ASSERT
        //String expected = "The world";
        String expected = "worldo";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountWords(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.hasStopAppeared(inputText);

        int actual = myWord.getAmountOfWords();

        //ASSERT
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountWordsWith2Words(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello";
        myWord.hasStopAppeared(inputText);

        inputText = "World";
        myWord.hasStopAppeared(inputText);

        int actual = myWord.getAmountOfWords();

        //ASSERT
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountWordsWith2Words1Input(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello World";
        myWord.hasStopAppeared(inputText);

        int actual = myWord.getAmountOfWords();

        //ASSERT
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountWordsWith4Words3Inputs(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello World";
        myWord.hasStopAppeared(inputText);

        inputText = "you";
        myWord.hasStopAppeared(inputText);

        inputText = "big!";
        myWord.hasStopAppeared(inputText);

        int actual = myWord.getAmountOfWords();

        //ASSERT
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetRowsMultipleWordsAndInputs(){
        //ARRANGE
        WritingWords myWord = new WritingWords();

        //ACT
        String inputText = "Hello world";
        myWord.hasStopAppeared(inputText);

        inputText = "please stop work";
        myWord.hasStopAppeared(inputText);

        int actual = myWord.getRow();
        //ASSERT
        int expected = 2;
        assertEquals(expected, actual);
    }

}
