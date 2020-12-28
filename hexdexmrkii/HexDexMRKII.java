/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexdexmrkii;

import java.util.Scanner;

/**
 * CSC 206 
 * Mr. Osborne
 * @author Isaiah J Jones
 * 2-14-17
 */
public class HexDexMRKII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        String userNumber;
        String cap10;

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt user for a hexedecimal number
        System.out.println("Enter a hexedecimal number:");

        //Store and read user's number
        userNumber = input.nextLine();
        cap10 = userNumber.toUpperCase();

        //Print out the base-10 number
        System.out.println(cap10 + " in Base-10 is " + hexToDecimal(userNumber.toUpperCase()));
    }
//Create Method hexToDecimal

    private static int hexToDecimal(String userNumber) {
        int decVal = 0;
        for (int i = 0; i < userNumber.length(); i++) {
            char x = userNumber.charAt(i);
            decVal = decVal * 16 + xToDecimal(x);
        }
        return decVal;
    }

    //Create Method xToDecimal
    public static int xToDecimal(char y) {
        if (y >= 'A' && y <= 'F') {
            return 10 + y - 'A';
        } else {
            return y - '0';
        }

    }

}
