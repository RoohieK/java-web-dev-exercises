package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  double radius = 0;
       System.out.println("What is the radius");
       double radius = input.nextDouble();

    /*    while(radius<0 ) {
            System.err.println("Enter a valid number");
            System.out.println("What is the radius");
            radius = input.nextDouble();
        } */

        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
        input.close();

    }
}
