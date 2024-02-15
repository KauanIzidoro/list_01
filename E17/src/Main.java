import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter the initial speed (in m/s): ";
        String system_phrase_2 = "Enter the acceleration(m/s²): ";
        String system_phrase_3 = "Enter the travel time (in seconds): ";
        String user_phrase_1 = "The speed is: ";
        // V = V_0 + a*T_0;
        double speed_0, acceleration_1, time_0;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        speed_0 = in.nextDouble();
        System.out.println(system_phrase_2);
        acceleration_1 = in.nextDouble();
        System.out.println(system_phrase_3);
        time_0 = in.nextDouble();

        double speed_final = speed_0 + (acceleration_1*time_0);

        System.out.println(user_phrase_1);
        System.out.println(speed_final);



    }
}
