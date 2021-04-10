package com.github.travelervihaan.gameoflife.board;

/**
 * Interface representing game board, which is square with specific size
 */
public interface IBoard {

    /**
     * Draws board with size determined by integer argument. Because board is a square, here is only one argument
     * @param size size - width and height, because board is a square
     */
    void drawBoard(int size);
}