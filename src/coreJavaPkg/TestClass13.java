//Core Java program to display the pattern like right angle triangle for a character
//Ex. Input char = "*", number of rows = 3
//Ex. Output line 1 = "*", line 2 = "**", line 3 = "***"

package coreJavaPkg;

public class TestClass13 {

    public static void main(String[] args) {
        //The character to print
        String chToPrint = "A.";

        //Number of rows to print
        int numOfRows = 8;

        //Outer loop from 1 to numOfRows - controls the rows
        for (int i = 1; i <= numOfRows; i++) {

            //Inner loop to print the chToPrint in the ith row
            for (int j = 1; j <= i; j++) {

                //Print chToPrint (without new line)
                System.out.print(chToPrint);
            }

            //Print a new line for the next i
            System.out.println();
        }
    }
}