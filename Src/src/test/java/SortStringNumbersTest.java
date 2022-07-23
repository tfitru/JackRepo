import org.junit.Assert;
import org.junit.Test;

public class SortStringNumbersTest {

    SortStringNumbers sortTest = new SortStringNumbers();


    @org.junit.jupiter.api.Test
    public void sortStringNumTest() {
        // Given or Arrange set up test
        String[] stringExample = {"1","15","9","4"};
        String[] expected = {"1", "4", "9", "15"};
        // When or Act action of method
        String[] actual = sortTest.sort(stringExample);
        // Then or Assert (assert statement)
        Assert.assertArrayEquals(expected, actual); // deprecated, replaced by a newer piece of code
    }

    @Test
    public void sortStringNumTest_LongerArray() {
        // Given or Arrange set up test
        String[] stringExample = {"1","15","9","4","45","231","0","12","538","7"};
        String[] expected = {"0","1","4","7","9","12","15","45","231","538"};
        // When or Act action of method
        String[] actual = sortTest.sort(stringExample);
        // Then or Assert (assert statement)
        Assert.assertArrayEquals(expected, actual); // deprecated, replaced by a newer piece of code
    }


    @Test
    public void numbersInWrongOrderTest_SingleDigitNumbers_FirstIsSmaller() {
        // Given
        String first = "5";
        String second = "8";
        Boolean expected = false;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numbersInWrongOrderTest_SingleDigitNumbers_FirstIsBigger() {
        // Given
        String first = "8";
        String second = "5";
        Boolean expected = true;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void numbersInWrongOrderTest_SingleDigitNumbers_NumbersAreEqual() {
        // Given
        String first = "8";
        String second = "8";
        Boolean expected = false;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void numbersInWrongOrderTest_MultipleDigitNumbers_SameLength_FirstNumberIsBigger() {
        // Given
        String first = "15";
        String second = "10";
        Boolean expected = true;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numbersInWrongOrderTest_MultipleDigitNumbers_SameLength_SecondNumberIsBigger() {
        // Given
        String first = "10";
        String second = "15";
        Boolean expected = false;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numbersInWrongOrderTest_MultipleDigitNumbers_SameLength_EqualNumbers() {
        // Given
        String first = "15";
        String second = "15";
        Boolean expected = false;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numbersInWrongOrderTest_MultipleDigitNumbers_DifferentLength_FirstNumberIsBigger() {
        // Given
        String first = "151";
        String second = "10";
        Boolean expected = true;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numbersInWrongOrderTest_MultipleDigitNumbers_DifferentLength_SecondNumberIsBigger() {
        // Given
        String first = "10";
        String second = "150";
        Boolean expected = false;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        // Then
        Assert.assertEquals(expected, actual);
    }


    // Leading zeros

    @Test
    public void leadingZeros_FirstNumberIsSmaller() {
        // Given
        String first = "0003";
        String second = "4";
        Boolean expected = false;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void trailingZeros_FirstNumberIsBigger() {
        // Given
        String first = "300";
        String second = "4";
        Boolean expected = true;
        // When
        Boolean actual = sortTest.firstNumberIsBigger(first,second);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeLeadingZeros_LeadingZeros() {
        // Given
        String input = "0003";
        String expected = "3";
        // When
        String actual = sortTest.removeLeadingZeros(input);
        // Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeLeadingZeros_TrailingZeros() {
        // Given
        String input = "3000";
        String expected = "3000";
        // When
        String actual = sortTest.removeLeadingZeros(input);
        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeLeadingZeros_AllZeros() {
        // Given
        String input = "0000";
        String expected = "0";
        // When
        String actual = sortTest.removeLeadingZeros(input);
        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeLeadingZeros_NoZeros() {
        // Given
        String input = "3";
        String expected = "3";
        // When
        String actual = sortTest.removeLeadingZeros(input);
        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeLeadingZeros_ZerosInTheMiddle() {
        // Given
        String input = "303";
        String expected = "303";
        // When
        String actual = sortTest.removeLeadingZeros(input);
        // Then
        Assert.assertEquals(expected,actual);
    }




    // Negative numbers



    // Decimals

    // Empty array

    // Strings that are not numbers @#$(%)_!

    // Characters and numbers 1F

    // Array less than 2

    // Non string object ex int or dog object (data validation) try/catch block
    // assert expects an error

    // Array is null (data validation)

    // Numbers written out

    // One hundred vs A hundred

    // Fractions, compound fraction


}
