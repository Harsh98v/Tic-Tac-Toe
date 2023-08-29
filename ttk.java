//Compiles all the files into one game
//Acts as the interface for the player class

import java.util.*;

public class ttk {
    static grid g = new grid();
    Scanner in = new Scanner(System.in);

    public static boolean evenodd(int n) { // Function to check when the flag is even or odd
        if (n % 2 == 0) {
            return true; // If even then Player One moves
        } else {
            return false; // If odd then Player Two moves
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("This is the status of the Tic Tac Toe grid: ");

        g.setboard();
        g.printboard();

        int flag = 0; // Start from player one

        do { // Keep running the code until winner is found
             // or there is a draw
            int r;
            int c;

            if (evenodd(flag)) { // Player 1's turn
                System.out.println("Player 1's turn: ");
                System.out.print("Enter the row and column to place the X in: ");
                while (true) {
                    r = in.nextInt();
                    c = in.nextInt();
                    if (g.board[r][c] == '-') {
                        g.board[r][c] = 'X';
                        break;
                    } else {
                        System.out.print("Please enter new location: ");

                    }
                }
                g.printboard();

            } else { // Player 2's turn
                System.out.println("Player 2's turn: ");
                System.out.print("Enter the row and column to place the O in: ");
                while (true) {
                    r = in.nextInt();
                    c = in.nextInt();
                    if (g.board[r][c] == '-') {
                        g.board[r][c] = 'O';
                        break;
                    } else {
                        System.out.print("Please enter new location: ");

                    }
                }
                g.printboard();
            }
            flag++; // Increment flag to move onto the next player
        }

        while ((end.game(g.board) == 0) && (end.draw(g.board) != true));

        if (end.game(g.board) != 0) {
            if (end.ganadora(end.game(g.board), g.board) == false) {
                System.out.println("X has won the game");
                System.out.println("Game over!");
            } else {
                System.out.println("O has won the game");
                System.out.println("Game over!");
            }
        }

        if (end.draw(g.board) == true) {
            System.out.println("Match ended in draw!");
            System.out.println("Game over!");
        }

        in.close();
    }
}