import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the radius of the cylinder (in cm): ";
        String system_phrase_2 = "Enter the height of the cylinder (in cm): ";
        String user_phrase_1 = "This cylinder has an volume equal to: ";
        double radius_c, height_c;
        double pi = PI;

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        radius_c = in.nextDouble();

        System.out.println(system_phrase_2);
        height_c = in.nextDouble();

        double area_base = Math.pow(radius_c, 2)*pi;
        double volume_c = area_base*height_c;

        System.out.println(user_phrase_1);
        System.out.println(volume_c);





    }
}
