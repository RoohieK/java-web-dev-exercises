package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodPracticeChapter2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String newInput = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] modifiedString = newInput.split("\\.");
        //String[] modifiedString = newInput.split(" ");
        //String[] modifiedString = newInput.split(",");
                 System.out.println(Arrays.toString(modifiedString));

    }

}
