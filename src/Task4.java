import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number1, number2: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int sum = 0;
        for (int i=number1; i<=number2; i++) {
            sum = sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
