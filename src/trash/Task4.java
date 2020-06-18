package trash;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number1, number2: ");
        int number1 = in.nextInt();
        int n = in.nextInt();
        while ( n <= 98)  {
            System.out.print (n);
            n+=7;
        }
    }
}
