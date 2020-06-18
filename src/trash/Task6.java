package trash;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number1, number2: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        for (int i = number1; i <= number2; i++) {
            System.out.println("Numbs =" +  i * 5);
        }
    }}


