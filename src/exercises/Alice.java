package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] avg){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first Sentence of the Alice's Adventures in Wonderland");
        String firstSentence = input.nextLine();
        System.out.println("The first Sentence is:" + firstSentence);
        String caseInsensitive = firstSentence.toLowerCase();
        System.out.println(caseInsensitive.matches("alice"));
    }
}
