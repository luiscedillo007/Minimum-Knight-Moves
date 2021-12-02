public class ChessBoard {
    
    Coordinates[][] board;
    //int[][] board;

    public ChessBoard(int m, int n){
        board = new Coordinates[m][n];
        //board = new int[m][n];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = new Coordinates(i, j);  
            }
        }

    }

    public void printChessBoard(){
        System.out.println("");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Format -> [x, y]");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Where -> x = row index & y = col index");
        System.out.println("");
        for(int i = 0; i < board.length; i++){
            System.out.print("\t\t\t\t\t\t");
            System.out.print(i + " | ");
            for(int j = 0; j < board[i].length; j++){
                System.out.print("[ " + i + ", " + j + " ] ");
            }
            System.out.println("");
            if(i + 1 != board.length){
                System.out.println("");
            }else{
                System.out.print("\t\t\t\t\t\t");
                System.out.print("   ");
                for(int j = 0; j < board[i].length; j++){
                    System.out.print("    ___  ");
                }
                System.out.println("");
                System.out.print("\t\t\t\t\t\t");
                System.out.print("   ");
                for(int j = 0; j < board[i].length; j++){
                    System.out.print("     " + j + "   ");
                }
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public void printPosibleMoves(){
        System.out.println("");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print("[ " + board[i][j] + " ] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
