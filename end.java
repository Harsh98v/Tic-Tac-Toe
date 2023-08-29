//Compares all grids and when there is an occurence of three O's or X's in any direction then winner is declared 
//If conditions are fullfilled the winner is annnounced and the game ends
public class end {
    public static int game(char b[][]) {
        int sucess = 0;

        // Diagonal check first
        if (b[1][1] != '-') {
            if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
                sucess = 1;
            } else if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
                sucess = 2;
            }
        }

        // Row and Column Check
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == b[i][1] && b[i][1] == b[i][2] && b[i][0] != '-') {
                sucess = 3;
            } else if (b[0][i] == b[1][i] && b[1][i] == b[2][i] && b[0][i] != '-') {
                sucess = 4;
            }
        }

        return sucess;
    }

    public static boolean ganadora(int sucess, char b[][]) {
        boolean ganadora = false;
        if (sucess == 1 && b[0][0] == 'O') {
            ganadora = true;
        }

        if (sucess == 2 && b[0][2] == 'O') {
            ganadora = true;
        }

        for (int i = 0; i < 3; i++) {
            if (b[i][0] == b[i][1] && b[i][1] == b[i][2] && b[i][0] == 'O') {
                ganadora = true;
            } else if (b[0][i] == b[1][i] && b[1][i] == b[2][i] && b[0][i] == 'O') {
                ganadora = true;
            }
        }
        return ganadora;
    }

    public static boolean draw(char b[][]) {
        int flag = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == '-') {
                    flag++;
                }
            }
        }

        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }
}
