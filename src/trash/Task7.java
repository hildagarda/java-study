package trash;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number1: ");
        int number1 = in.nextInt();
        int sum = 0;
        for (int i=1; i<=number1; i++) {
            sum = sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
