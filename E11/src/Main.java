import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter a temperature in degrees Celsius: ";
        String user_phrase_1 = "Your temperature in degrees Fahrenheit is: ";
        double celsius, temp_1, constant_1, constant_2;
        constant_1 = 32;
        constant_2 = 1.8;


        System.out.println(system_phrase_1);

        Scanner in = new Scanner(System.in);
        celsius = in.nextDouble();
        temp_1 = celsius*constant_2;
        double fahrenheit = temp_1+constant_1;

        System.out.println(user_phrase_1);
        System.out.println(fahrenheit);




    }
}
