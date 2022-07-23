public class SortStringNumbers {

    // Given
    // String array containing numbers
    // For example, ["1","15","9","4"]
    // Task is to sort in ascending order
    // But they  have to stay strings, no numbers!



    public String[] sort(String[] input) {
        // sort lex sort by length
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (firstNumberIsBigger(input[i], input[i+1])) { // Need tests in code,
                    String temp = input[i]; // holds the value temporarily so you can swap them
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }

            }
        }
        // nested for loop inside a while loop, flag
        // if something is changed go through the while loop
        // iterate through the array until nothing is out of order
        // sorted early it will stop
        // bubble sort, insertion sort etc.

        // improve test
        // edge case, more tests, existing code more efficient and easy to read
        // long if statement can be easier to read


        return input;
    }


    public Boolean firstNumberIsBigger(String first, String second){
        first = removeLeadingZeros(first);
        second = removeLeadingZeros(second);
        if(first.length()>second.length()) {return true;}
        if(first.length()==second.length() && first.compareTo(second) > 0){return true;}
        if(first.length()<second.length()){return false;}
        return false;
    }

    public String removeLeadingZeros(String input){
        while(input.charAt(0)=='0' && input.length()>1) {
            input = input.substring(1);
        }
        return input;
    }

    // next step
    // make tests for sorting method that includes leading zeros
    // negative, decimal test cases same method
    // make sure it works
    // bottom sub method working to the top, minimize the error possibilities
    // Questions?



}
