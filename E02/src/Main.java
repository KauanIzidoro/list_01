import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        String system_phrase_1 = "Enter a number: ";
        String user_phrase_1 = "This squared number is: ";
        double number_1, number_2;


        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        number_1 = in.nextInt();
        number_2 = Math.pow(number_1, 2);

        System.out.println(user_phrase_1);
        System.out.println(number_2);




    }
}