//3 by 3 grid
//Update interactable vs non-interactable zones

public class grid {
    char[][] board = new char[3][3]; // 3x3 grid

    void setboard() { // For setting the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    void printboard() { // For printing the board
        System.out.println("0\t1\t2"); // label the columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}