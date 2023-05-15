import java.util.Scanner;

public class TicTacToe { 
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
        };
        
        char proximoPlayer = 'X';
        Scanner s = new Scanner(System.in);
        int[] posJogada = new int[2];

        
        boolean continuarJogando = true;
        while(continuarJogando){
            printBoard(board);
            System.out.println("Vez do " + proximoPlayer);
            System.out.println("Escolha a linha: ");
            posJogada[0] = s.nextInt();
            System.out.println("Escolha a coluna: ");
            posJogada[1] = s.nextInt();
            
            if (posIsAlreadyPlayed(board, posJogada)){
                System.out.println("Posicao já jogada, tente novamente!");
                continue;
            }
            board[posJogada[0]][posJogada[1]] = proximoPlayer;

            if (result(board, posJogada)){
                System.out.println("Vencedor é o: " + proximoPlayer);
                printBoard(board);
                continuarJogando = false;

            } else { proximoPlayer = 
                     proximoPlayer == 'X' ? 'O' : 'X'; }
        }
        s.close();
    }

    public static void printBoard(char[][] board) { 
        System.out.println("Board:");
        System.out.println(" 0   1   2\n");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + board[i][j]);
                if (j < board.length-1) {
                    System.out.print(" |");
                }
            }
            System.out.println("   " + i);
            if (i < board.length-1) {
                System.out.println("---|---|---");
            }
            
        }
        System.out.println();
    }
    public static boolean result(char[][] board, int[] pos){
        if (resultDiagonais(board)) {
            return true;
        } else if (resultRow(board, pos[0])) {
            return true;
        } else if (resultCol(board, pos[1])) {
            return true;
        } 
        return false;
    }

    public static boolean resultDiagonais(char[][] board){
        if (board[0][0] == ' '){
            return false;
        } 
        return ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]));
    }

    public static boolean resultRow(char[][] board, int row){
        if (board[row][0] == ' '){
            return false;
        } 
        return ((board[row][0] == board[row][1]) && (board[row][0] == board[row][2]));
    }

    public static boolean resultCol(char[][] board, int col){
        if (board[0][col] == ' '){
            return false;
        } 
        return ((board[0][col] == board[1][col]) && (board[0][col] == board[2][col]));
    }

    public static boolean posIsAlreadyPlayed(char[][] board, int[] pos){
        return board[pos[0]][pos[1]] != ' ';                 
    }
}