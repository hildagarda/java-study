package learning;

public class ChessDesk {
    public static void main(String[] args) {
        char[][] mas = new char[8][8];
        mas[7][0] = '♖'; mas[7][7] = '♖';mas[7][1] = '♘';mas[7][6] = '♘';
        mas[7][2] = '♗';mas[7][5] = '♗';mas[7][3] = '♕';mas[7][4] = '♔';
        mas[6][0] = '♙';mas[6][1] = '♙';mas[6][2] = '♙';mas[6][3] = '♙';
        mas[6][4] = '♙';mas[6][5] = '♙';mas[6][6] = '♙';mas[6][7] = '♙';
        mas[0][0] = '♜'; mas[0][7] = '♜';mas[0][1] = '♞';mas[0][6] = '♞';
        mas[0][2] = '♝';mas[0][5] = '♝';mas[0][3] = '♛';mas[0][4] = '♚';
        mas[1][0] = '♟';mas[1][1] = '♟';mas[1][2] = '♟';mas[1][3] = '♟';
        mas[1][4] = '♟';mas[1][5] = '♟';mas[1][6] = '♟';mas[1][7] = '♟';

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] != '\u0000' ? mas[i][j] : " "+'.');
            }
            System.out.println();
        }
    }
}
