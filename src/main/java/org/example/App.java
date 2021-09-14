package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        final int paint = 350;

        System.out.printf( "What is the length of the room in feet? " );
        String len = reader.nextLine();

        System.out.printf( "What is the width of the room in feet? " );
        String wid = reader.nextLine();

        System.out.println("You entered dimensions of " + len + " feet by " + wid + " feet.");

        int f1 = Integer.parseInt(len);
        int f2 = Integer.parseInt(wid);
        int area = f1 * f2;
        int initArea = area;
        int i = 1;

        // Loops through the area dimension to match the paint 
        while (area > paint) {
            area = area - paint;
            i++;
        }

        System.out.printf( "You will need to purchase %d gallons of paint to cover %d square feet. ", i, initArea );

    }
}