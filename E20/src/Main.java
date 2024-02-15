import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the first root: ";
        String system_phrase_2 = "Enter the second root: ";
        String user_phrase_1 = "Your equation is: ";
        double root_1, root_2;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        root_1 = in.nextDouble();
        System.out.println(system_phrase_2);
        root_2 = in.nextDouble();

        double root_sum = root_1 + root_2;
        double root_product = root_1*root_2;

        if (root_sum > 0 && root_product >= 0) {
            System.out.println(user_phrase_1 + " x^2 - " + Math.abs(root_sum) + "x + " + Math.abs(root_product));
        } else if (root_sum > 0 && root_product <= 0) {
            System.out.println(user_phrase_1 + " x^2 - " + Math.abs(root_sum) + "x - " + Math.abs(root_product));
        } else if (root_sum < 0 && root_product >= 0) {
            System.out.println(user_phrase_1 + " x^2 + " + Math.abs(root_sum) + "x + " + Math.abs(root_product));
        } else if (root_sum < 0 && root_product <= 0) {
            System.out.println(user_phrase_1 + " x^2 + " + Math.abs(root_sum) + "x - " + Math.abs(root_product));
        }



    }
}
