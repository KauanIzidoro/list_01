import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String system_phrase_1 = "Enter an integer: ";
        String user_phrase_1 = "The double of this number is: ";
        int number_1, number_2;


        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        number_1 = in.nextInt();
        number_2 = number_1*2;

        System.out.println(user_phrase_1);
        System.out.println(number_2);





    }
}