package trash;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("как Вас зовут?: ");
        String name = in.nextLine();
        System.out.println("Привет -"+" "+ name);
    }

}
