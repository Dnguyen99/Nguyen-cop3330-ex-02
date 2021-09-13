/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String str = input.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }
//Displays the total number of characters present in the given string
        System.out.println("\n"+str+" has "+count+" characters.");

    }
}
