import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a measure of base from triangle (in cm): ";
        String system_phrase_2 = "Enter a measure of height from triangle (in cm): ";
        String user_phrase_1 = "This triangle have a area equal: ";
        double base_t, height_t;

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        base_t = in.nextDouble();

        System.out.println(system_phrase_2);
        height_t = in.nextDouble();

        double area_t = (base_t*height_t)/2;

        System.out.println(user_phrase_1);
        System.out.println(area_t);


    }
}
