package util;

import java.util.Scanner;

public class Input {

    private Scanner nsa = new Scanner(System.in); //Setting up the scanner in the field

    public String getString() {
        String nameInput = nsa.nextLine();
        return nameInput;
    }
    public boolean yesNo(String prompt) {
        //prompt is asked in the psvm
        String confirm = nsa.nextLine();
        System.out.println(confirm);//return
        return confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("sure") || confirm.equalsIgnoreCase("absolutely");
    }
    //Improve your Input class.
    //Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double. You can do this by replacing the use of the Scanner nextInt() and nextDouble() methods with the existing getString() method you created in a previous exercise using the following methods to convert the returned String into the desired datatype: Integer.valueOf(String s); Double.valueOf(String s);
    public int getInt() {
        try {
            // something that might go wrong
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            // handle the error
            System.out.println("You did not enter the correct data");
            return getInt();
        }

    }

    public int getInt(int min, int max, String prompt) {
        //print prompt every time this method is called
        System.out.println(prompt);
        //get int from user
        int userInput = getInt();

        if (userInput < min || userInput > max) {
            System.out.println("You're number is not between " + min + " and " + max);
            userInput = getInt(min, max, prompt);
        }
        //else return the int
        return userInput;
    }
    public double getDouble() {
        //using this as a scanner. Exceptions and Error handling encourages making this more robust by using try catch on parseInt
        try {
            // something that might go wrong
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            // handle the error
            System.out.println("You did not enter correct data. try a number that looks like this: 1.0 ");
            return getDouble();
        }


    }

    public double getDouble(double min, double max) {
        //my prompts are best situated in the inputTest psvm, so that these functions can be reused without polluting w./ additional prompts
        double doubleInput = getDouble();

        if (doubleInput < min || doubleInput > max) {
            System.out.println("You're out of range, my man ");
            doubleInput = getDouble(min, max);
        }
        //else return the double
        return doubleInput;
    }




}


