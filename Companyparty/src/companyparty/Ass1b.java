/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyparty;

import java.util.Scanner;
/**
 *
 * @author Nimesha
 */
public class Ass1b
{
    public static void main(String[] args)
    {
        //Importing two scanner classes for Text and Number inputs
        Scanner inText = new Scanner(System.in);
        Scanner inNumber = new Scanner(System.in);

        //Declaration of variables
        String taxPayerName;
        int taxPayerIncome;
        double tax = 0;

        //Message prompt asking user to enter a tax payers name and storing the input into the assigned String object
        System.out.print("Please enter the name of the tax payer ==> ");
        taxPayerName = inText.nextLine();

        //Message prompt asking the user to enter the tax payers income and storing the input into the assigned Interger variable
        System.out.print("Enter the income for " + taxPayerName + " ==> " );
        taxPayerIncome = inNumber.nextInt();

        if (taxPayerIncome > 18200) {
            tax = 0;
        } else if (taxPayerIncome > 37000) {
            tax = (taxPayerIncome - 18200) * 0.19;
        } else if (taxPayerIncome > 87000) {
            tax = 3572 + (taxPayerIncome - 37000) * 0.325;
        } else if (taxPayerIncome > 180000) {
            tax = 19822 + (taxPayerIncome - 87000) * 0.37;
        } else {
            tax = 54232 + (taxPayerIncome - 180000) * 0.47;
        }


        //Message prompt stating the amount of tax the tax payer owes
        System.out.println("The tax that " + taxPayerName + " has to pay is $" + tax);
    }
} 