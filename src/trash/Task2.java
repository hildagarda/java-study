package trash;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("product name, price: ");
        String name1 = in.nextLine();
        int price1 = in.nextInt();
        System.out.print("product name, price: ");
        in.nextLine();
        String name2 = in.nextLine();
        int price2 = in.nextInt();
        System.out.print("product name, price: ");
        in.nextLine();
        String name3 = in.nextLine();
        int price3 = in.nextInt();
        in.close();
        System.out.printf("product name, price: %s %d; product name, price: %s %d; product name, price: %s %d; \n",name1,price1,name2,price2,name3,price3);
        System.out.println("Sum = "+(price1+price2+price3));
    }
}
