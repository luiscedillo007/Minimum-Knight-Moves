// javac -d bin Main.java
// java -cp bin Main

public class Main {
    public static void main(String[] args) {
        
        Sprites menuSprites = new Sprites();
        menuSprites.printWelcomeSign();
        menuSprites.printWelcomeText();

        ChessBoard myChessBoard = new ChessBoard(8, 8);
        myChessBoard.printChessBoard();

        Input userInput = new Input();
        int n = userInput.checkNIntInput(myChessBoard.board.length);
        int m = userInput.checkMIntInput(myChessBoard.board.length);
        int n2 = userInput.checkN2IntInput(myChessBoard.board.length);
        int m2 = userInput.checkM2IntInput(myChessBoard.board.length);

        menuSprites.printInitialCoordinates(n, m);
        menuSprites.printFinalCoordinates(n2, m2);
        start(n, m, n2, m2, myChessBoard);

    }

    public static void start(int initialRow, int initialCol, int finalRow, int finalCol, ChessBoard myChessBoard){
        Queue myQueue = new Queue();
        Coordinates initialPosition = new Coordinates(initialRow, initialCol);
        Coordinates finalPosition = new Coordinates(finalRow, finalCol);

        int finalSteps = CountSteps(myQueue, myChessBoard, initialPosition, finalPosition, false);
        Sprites menuSprites = new Sprites();
        menuSprites.printAnswer(initialPosition.rowPos, initialPosition.colPos, finalPosition.rowPos, finalPosition.colPos, finalSteps);
    }

    public static int CountSteps(Queue myQueue, ChessBoard myChessBoard, Coordinates currentPosition, Coordinates finalPosition, boolean flag){

        if(myQueue.isEmpty() && flag){
            return -1;
        }

        if(currentPosition.rowPos == finalPosition.rowPos && currentPosition.colPos == finalPosition.colPos){
            return currentPosition.step;
        }

        enqueueAvailableSteps(myQueue, currentPosition, myChessBoard.board.length);
        Node newPosition = myQueue.dequeue(); 

        return CountSteps(myQueue, myChessBoard, newPosition.position, finalPosition, true);
        

    } 

    public static void enqueueAvailableSteps(Queue myQueue, Coordinates curPos, int len){
        int[][] changePos = {{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2}};
        
        for(int i = 0; i < changePos.length; i++){
            
            if(curPos.rowPos + changePos[i][0] < len && curPos.rowPos + changePos[i][0] > 0 && curPos.colPos + changePos[i][1] < len && curPos.colPos + changePos[i][1] > 0){
                int newRowPos = curPos.rowPos + changePos[i][0]; 
                int newColPos = curPos.colPos + changePos[i][1];
                Node newStep = new Node(new Coordinates(newRowPos, newColPos));
                newStep.position.step = curPos.step + 1;
                myQueue.enqueue(newStep);
            }
            
        }

    }

    /*
    public static void testing(){

        ChessBoard myChessBoard = new ChessBoard(8, 8);

        //myBoard.populateChessBoard();
        int[][] changePos = {{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2}};

        //myBoard.printChessBoard();
        myChessBoard.printPosibleMoves();
        
        myChessBoard.board[3][3] = 1;
        int[] cur = {3,3};
        posibleMoves(cur, myChessBoard.board);

        myChessBoard.printPosibleMoves();


    }

    public static void posibleMoves(int[] curPos, int[][] myBoard){
        int[][] changePos = {{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2}};
        
        for(int i = 0; i < changePos.length; i++){
            
            if(curPos[0] + changePos[i][0] < myBoard.length && curPos[0] + changePos[i][0] > 0 && curPos[1] + changePos[i][1] < myBoard.length && curPos[1] + changePos[i][1] > 0){
                int newRowPos = curPos[0] + changePos[i][0]; 
                int newColPos = curPos[1] + changePos[i][1];
                myBoard[newRowPos][newColPos] = 2;
            }
            
        }
        
    }
    */


}
