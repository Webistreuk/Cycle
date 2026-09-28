import java.util.Scanner;
import java.lang.Math;

public class Main {
    static void main() {
        String result_surp = "";
        Integer min = 1;
        Integer max = 4;
        Integer random_number = (int)(Math.random() * (max - min + 1)) + min;
        Scanner in = new Scanner(System.in);
        System.out.println("Первый подарок");
        String first_surp = in.nextLine();
        System.out.println("Второй подарок");
        String second_surp = in.nextLine();
        System.out.println("Третий подарок");
        String thirdy_surp = in.nextLine();
        System.out.println("Четвертый подарок");
        String fourth_surp = in.nextLine();
        switch (random_number) {
            case 1:
                System.out.println(first_surp + " вы купили подарок для друга");
                result_surp = first_surp;
                break;
            case 2:
                System.out.println(second_surp + " вы купили подарок для друга");
                result_surp = second_surp;
                break;
            case 3:
                System.out.println(thirdy_surp + " вы купили подарок для друга");
                result_surp = thirdy_surp;
                break;
            case 4:
                System.out.println(fourth_surp + " вы купили подарок для друга");
                result_surp = fourth_surp;
                break;
        }
    }
}