package trash;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number: ");
        int number = in.nextInt();
        if (number == 1) System.out.println("Понедельник");
        else if (number == 2 ) System.out.println("Вторник");
        else if (number == 3) System.out.println("Среда");
        else if (number == 4) System.out.println("Четверг");
        else if (number == 5) System.out.println("Пятница");
        else if (number == 6) System.out.println("Суббота");
        else if (number == 7) System.out.println("Воскресенье");

    }

}
