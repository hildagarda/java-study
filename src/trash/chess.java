package trash;



public class chess {

    public static void main(String[] args) {
        System.out.println("  _ "+"_ "+"_ "+"_ " +"_ "+"_ "+"_ "+"_ ");
        for (int i = 1; i < 9; i++) {
            {
                 System.out.print(i);
            }
            for (int j = 0; j < 8; j++) {

                System.out.print("|_");

                if (j ==7){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
}