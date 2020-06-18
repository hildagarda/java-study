package trash;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number1, number2: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = a; i <= b; i++) {

            if (i % 3 == 0) {
                sum1 += i;
            } else  {
                sum2 += i;
            }
            System.out.println("i = " + i);
        }
        System.out.println("sum1 = " + sum1 + ", sum2 = " + sum2 );
    }
}



