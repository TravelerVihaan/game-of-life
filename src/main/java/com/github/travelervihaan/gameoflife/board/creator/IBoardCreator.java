package com.github.travelervihaan.gameoflife.board.creator;

import com.github.travelervihaan.gameoflife.board.IBoard;

/**
 * Interface representing game board, which is square with specific size
 */
public interface IBoardCreator {

    /**
     * Draws board with size determined by integer argument. Because board is a square, here is only one argument
     */
    IBoard initializeBoard();
}
