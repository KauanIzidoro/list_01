import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a speed in km/h: ";
        String user_phrase_1 = "Your speed in m/s is: ";
        double speed_1, speed_2, converter;
        converter =  0.2777777777777778;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        speed_1 = in.nextDouble();

        speed_2 = speed_1*converter;

        System.out.println(user_phrase_1);
        System.out.println(speed_2);


    }
}
