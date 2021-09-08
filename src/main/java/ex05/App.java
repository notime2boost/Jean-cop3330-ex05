package ex05;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        String Snum1 = input.nextLine();
        System.out.println("What is the second number?");
        String Snum2 = input.nextLine();
        int num1 = Integer.parseInt(Snum1);
        int num2 = Integer.parseInt(Snum2);

        int sum = num1 + num2;
        int diff = num1 - num2;
        int mult = num1 * num2;
        int div = num1/num2;

        System.out.println(num1+"+"+num2+"="+sum);
        System.out.println(num1+"-"+num2+"="+diff);
        System.out.println(num1+"*"+num2+"="+mult);
        System.out.println(num1+"/"+num2+"="+div);
    }
}
