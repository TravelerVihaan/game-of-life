package com.github.travelervihaan.gameoflife.cells;

import com.github.travelervihaan.gameoflife.board.IBoard;

/**
 * This class represents single cell in board. Cell stores information about it place on game board and state of life @see {@link com.github.travelervihaan.gameoflife.cells.CellState}.
 */
public interface ICell {

    void updateCellState();

    /**
     * Gives back value of coordinate X
     * @return coordinate X
     */
    int getLocationX();

    /**
     * Gives back value of coordinate Y
     * @return coordinate Y
     */
    int getLocationY();

    /**
     * Return location of cell as array of coordinates X and Y
     * @return an Coordinates object contains coordinates X and Y of cell
     */
    Coordinates getCoordinates();

    /**
     * Returns information about state of cell - alive /dead
     * @return boolean value: true = alive, false - dead
     */
    CellState getCurrentCellState();

    CellState getNextCellState();

    void calculateNewCellState(long aliveNeighbours);
}
