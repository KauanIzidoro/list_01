import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String system_phrase_1 = "Enter first grade: ";
        String system_phrase_2 = "Enter second grade: ";
        String user_phrase_1 = "Your average is: ";

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);

        double grade_1 = in.nextDouble();
        System.out.println(system_phrase_2);

        double grade_2 = in.nextDouble();

        double sum_grade = grade_1+grade_1;
        double average = sum_grade*0.5;

        System.out.println(user_phrase_1);
        System.out.println(average);







    }




}
