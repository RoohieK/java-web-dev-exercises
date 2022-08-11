package exercises;

import java.util.ArrayList;
import java.util.Scanner;

//import static java.lang.Long.sum;

public class ArrayListPracticeChapter2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int newNo;
        System.out.println("Enter the numbers");
        do{
            newNo = input.nextInt();
            numbers.add(newNo);
        }while(numbers.size() <= 9);
        int sumOut = sumEven(numbers);
        System.out.println(sumOut);
    }

    public static int sumEven(ArrayList<Integer> listOfNum){
        int total = 0;
    //    for( int index = 0; index < listOfNum.size(); index++) {
        for(int num : listOfNum){
           // if (listOfNum.get(index) % 2 == 0) {
             //   total += listOfNum.get(index);
            if(num%2 == 0){
                total +=num;
            }

        }
        return total;
    }

}
