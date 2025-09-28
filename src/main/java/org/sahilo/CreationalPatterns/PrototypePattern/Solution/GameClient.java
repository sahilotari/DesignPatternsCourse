package org.sahilo.CreationalPatterns.PrototypePattern.Solution;

public class GameClient {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();

        board.addPiece(new GamePiece("Red", 1));
        board.addPiece(new GamePiece("Blue", 2));

        board.displayBoard();

        // Checkpoint this state
        GameBoard checkpoint = board.clone();
        checkpoint.displayBoard();

    }
}
