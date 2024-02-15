import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the angular coefficient of the equation: ";
        String system_phrase_2 = "Enter the linear coefficient of the equation: ";
        String user_phrase_1 = "Your equation is: ";
        String user_phrase_2 = "The root is: ";
        String system_phrase_3 = "This equation is not linear, the angular coefficient cannot be zero. ";
        double coef_a, coef_b;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        coef_a = in.nextDouble();
        System.out.println(system_phrase_2);
        coef_b = in.nextDouble();

        if (coef_a != 0) {
            double root_1 = -coef_b*Math.pow(coef_a, -1);

            if (coef_b > 0) {
                System.out.println(user_phrase_1 + coef_a + "x + " + coef_b + " = 0");
                System.out.println(user_phrase_2 + root_1);

            } else {
                System.out.println(user_phrase_1 + coef_a + "x  " + coef_b + " = 0");
                System.out.println(user_phrase_2 + root_1);

            }

        } else {

            System.out.println(system_phrase_3);

        }



    }
}
