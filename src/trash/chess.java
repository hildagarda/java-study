package trash;



public class chess {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            if (i % 2 != 0) {

                System.out.print(" ");
            }

            for (int j = 0; j < 4; j++) {

                System.out.print("* ");
            }

            System.out.println();

        }
    }
}