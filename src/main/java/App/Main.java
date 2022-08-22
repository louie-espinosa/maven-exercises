package App;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner gimmeSumthin = new Scanner(System.in);

        System.out.print("Hey, type sum stuff here -->: ");
        String response = gimmeSumthin.nextLine();
        //The StringUtils class is a Java static method that lets us manipulate strings
        System.out.println(response);
        //is response a number?
        System.out.println(StringUtils.isNumeric(response));
        //flips the case of the string
        System.out.println(StringUtils.capitalize(response));
        //reverses the string
        System.out.println(StringUtils.reverse(response));


    }

}
