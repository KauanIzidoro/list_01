import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a real number: ";
        String user_phrase_1 = "The fifth part of this number is: ";

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        double number_1 = in.nextDouble();
        double number_2 = number_1 / 5;

        System.out.println(user_phrase_1);
        System.out.println(number_2);
    }








}
