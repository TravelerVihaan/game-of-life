package com.github.travelervihaan.gameoflife.cells;

/**
 * This class represents single cell in board. Cell stores information about it place on game board and state of life @see {@link com.github.travelervihaan.gameoflife.cells.CellState}.
 */
public interface ICell {

    boolean changeCellState();

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
     * Return cell position on board, which determines count of neighbours.
     * @return cell position
     */
    CellPosition getCellPosition();

    /**
     * Returns information about state of cell - alive /dead
     * @return boolean value: true = alive, false - dead
     */
    boolean getCellState();
}
