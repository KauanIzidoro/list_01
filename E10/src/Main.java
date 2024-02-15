import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a measure in miles: ";
        String user_phrase_1 = "Your measure in km is: ";
        double measure_1, measure_2, conversor;
        conversor = 1.609344497892563;

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        measure_1 = in.nextDouble();
        measure_2 = measure_1*conversor;

        System.out.println(user_phrase_1);
        System.out.println(measure_2);
    }
}
