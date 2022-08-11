package exercises;

//import java.util.Scanner;
public class ArrayPracticeClass2 {
    public static void main(String[] args){
      //  Scanner input = new Scanner(System.in);
        int[] numbers = {1,1,2,3,5,8};
        for(int num : numbers){
            if(num%2==1) {
                System.out.println(num);
            }
        }
    }
}
