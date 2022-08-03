package exercises;
import java.util.Scanner;

public class NumericTypesMilesPerGalon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you drove:");
        float miles = input.nextFloat();
        System.out.println("Please enter the amount of gas utilized :");
        float gallons = input.nextFloat();
        System.out.println("Miles-per-gallon are:" + miles/gallons);


    }
}
