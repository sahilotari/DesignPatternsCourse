package org.sahilo.CreationalPatterns.PrototypePattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard>{
    private List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public List<GamePiece> getPieces() {
        return pieces;
    }

    public void displayBoard() {
        System.out.println("Current Game Board:");
        for (GamePiece piece : pieces) {
            System.out.println(piece);
        }
    }

    // Deep clone method
    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for (GamePiece piece : this.pieces) {
            newBoard.addPiece(piece.clone());
        }
        return newBoard;
    }
}
