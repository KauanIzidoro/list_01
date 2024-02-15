import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String system_phrase_1 = "Enter first grade: ";
        String system_phrase_2 = "Enter second grade: ";
        String user_phrase_1 = "Your average is: ";
        double grade_1, grade_2;

        System.out.println(system_phrase_1);
        Scanner in = new Scanner(System.in);
        grade_1 = in.nextDouble();
        System.out.println(system_phrase_2);
        grade_2 = in.nextDouble();

        double average_1 = grade_1 + 2*grade_2;
        double average_final = average_1/3;

        System.out.println(user_phrase_1);
        System.out.println(average_final);


    }
}
