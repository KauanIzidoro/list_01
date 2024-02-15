import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the radius of the cone (in cm): ";
        String system_phrase_2 = "Enter the height of the cone (in cm): ";
        String user_phrase_1 = "This cone has an volume equal to: ";
        double radius_1, height_1;
        double pi = PI;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        radius_1 = in.nextDouble();
        System.out.println(system_phrase_2);
        height_1 = in.nextDouble();

        double area_base = Math.pow(radius_1, 2)*pi;
        double volume_final = (area_base*height_1)/3;

        System.out.println(user_phrase_1);
        System.out.println(volume_final);




    }
}
