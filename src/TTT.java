import java.util.Scanner;

public class TTT {
        public static void main(String[] args) {
            char[][] board = {{' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

            printBoard(board);

            while (true) {
                Scanner input = new Scanner(System.in);

                System.out.println("Player1 Choose Placement (1-9): ");
                int placement1 = input.nextInt();
                System.out.println(placement1);
                setPlace1(board, placement1);
                printBoard(board);
                if (winner(board) == true) {
                    break;
                }
                if (boardFull(board) == true) {
                    break;
                }

                System.out.println("Player2 Choose Placement (1-9): ");
                int placement2 = input.nextInt();
                System.out.println(placement2);
                setPlace2(board, placement2);
                printBoard(board);
                if (winner(board) == true) {
                    break;
                }
                if (boardFull(board) == true) {
                    break;
                }
            }
            System.out.println("GAME OVER!");

        }

        public static boolean boardFull(char[][] board) {
            for (int i = 0; i < board.length; ++i) {
                for (int j = 0; j < board[i].length; ++j) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
        public static boolean winner(char[][] board) {
            if(     (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') ||
                    (board[1][0] =='x' && board[1][1] == 'x' && board[1][2] == 'x') ||
                    (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x') ||
                    (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x') ||
                    (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x') ||
                    (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x') ||
                    (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') ||
                    (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')      ) {
                System.out.println("Player1 Wins!");
                return true;

            }

            else if((board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') ||
                    (board[1][0] =='o' && board[1][1] == 'o' && board[1][2] == 'o') ||
                    (board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o') ||
                    (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o') ||
                    (board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o') ||
                    (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o') ||
                    (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') ||
                    (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o')) {
                System.out.println("Player2 Wins!");
                return true;
            }
            else{System.out.println("No Winner!");
                return false;}
        }

        public static void printBoard(char[][] board) {
            System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
            System.out.println("-+-+-");
            System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
            System.out.println("-+-+-");
            System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

        }

        public static void setPlace1(char[][] board, int placement1) {
            switch (placement1) {
                case 1:
                    board[0][0] = 'x';
                    break;
                case 2:
                    board[0][1] = 'x';
                    break;
                case 3:
                    board[0][2] = 'x';
                    break;
                case 4:
                    board[1][0] = 'x';
                    break;
                case 5:
                    board[1][1] = 'x';
                    break;
                case 6:
                    board[1][2] = 'x';
                    break;
                case 7:
                    board[2][0] = 'x';
                    break;
                case 8:
                    board[2][1] = 'x';
                    break;
                case 9:
                    board[2][2] = 'x';
                    break;
                default:
                    break;
            }
        }

        public static void setPlace2(char[][] board, int placement2) {
            switch (placement2) {
                case 1:
                    board[0][0] = 'o';
                    break;
                case 2:
                    board[0][1] = 'o';
                    break;
                case 3:
                    board[0][2] = 'o';
                    break;
                case 4:
                    board[1][0] = 'o';
                    break;
                case 5:
                    board[1][1] = 'o';
                    break;
                case 6:
                    board[1][2] = 'o';
                    break;
                case 7:
                    board[2][0] = 'o';
                    break;
                case 8:
                    board[2][1] = 'o';
                    break;
                case 9:
                    board[2][2] = 'o';
                    break;
                default:
                    break;
            }

        }
    }

