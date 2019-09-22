package com.company;

import java.util.Scanner;

public class Complete {
        public static void main(String[] args) {

            int number;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number");
            number=input.nextInt();

            if (number > 10) {
                System.out.println("Number is greater than 10.");
            }
            else if(number< 10) {
                System.out.println("Number is less than 10.");
            }
            else{
                System.out.println("Value is equal to 10");
            }
            System.out.println("Application finished.");
        }
    }

