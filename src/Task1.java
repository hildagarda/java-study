
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("product name, price: ");
        String name1 = in.nextLine();
        int price1 = in.nextInt();
        if (price1 == 100) System.out.println("как раз");
        else if (price1 > 100 ) System.out.println("дорого");
        else System.out.println("дешего");
        System.out.printf("product name, price: %s %d; \n",name1,price1);

    }

}
