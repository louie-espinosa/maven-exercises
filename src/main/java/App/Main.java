package App;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner gimmeSumthin = new Scanner(System.in);

        System.out.print("Hey, type sum stuff here -->: ");
        String response = gimmeSumthin.nextLine();
        //The StringUtils class is a utility library that lets us do some cool stuff, like manipulate strings
        System.out.println(response);
        //is response a number?
        System.out.println(StringUtils.isNumeric(response));
        //flips the case of the first char of a string
        System.out.println(StringUtils.swapCase(response));
        //reverses the string
        System.out.println(StringUtils.reverse(response));


    }

}
