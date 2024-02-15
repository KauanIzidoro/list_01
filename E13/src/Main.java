import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the radius of a circle in cm: ";
        String user_phrase_1 = "The circle has an area equal to: ";
        double pi = PI;
        double radius;

        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();

        double area = pi*Math.pow(radius, 2);

        System.out.println(user_phrase_1);
        System.out.println(area);








    }
}