package org.sahilo.CreationalPatterns.PrototypePattern.Problem;

public class GameClient {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();

        board.addPiece(new GamePiece("Red", 1));
        board.addPiece(new GamePiece("Blue", 2));

        board.displayBoard();

        // Checkpoint this state
        GameBoard checkpoint = new GameBoard();
        for (GamePiece piece : board.getPieces()) {
            checkpoint.addPiece(new GamePiece(piece.getColor(), piece.getPosition()));
        }
        checkpoint.displayBoard();

    }
}
