// Using an ACSII chart, find the range of values for each 
// of the different characters sets - numbers, lower 
// case letters, and upper case letters.  Then using a `for` 
// loop, print the valid values in each set. 

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        ControlFlow.printNumbers();
        ControlFlow.printUpperCaseLetters();
        ControlFlow.printLowerCaseLetters();

        System.out.print("Would you like to continue?");

        input.close();
    }
    public static void printNumbers()
    {
      // TODO: print valid numeric input
    }
  
    public static void printLowerCaseLetters()
    {
      // TODO: print valid lowercase alphabetic input
    }
  
    public static void printUpperCaseLetters()
    {
      // TODO: print valid uppercase alphabetic input
    }

   
}
