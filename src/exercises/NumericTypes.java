package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the dimensions of the rectangle Length:");
        int length = input.nextInt();
        System.out.println("Width");
        int width = input.nextInt();
        System.out.println("Area of rectangle is :" + length*width);

    }
}
