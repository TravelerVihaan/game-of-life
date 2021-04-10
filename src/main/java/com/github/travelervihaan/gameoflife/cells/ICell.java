package com.github.travelervihaan.gameoflife.cells;

/**
 * This class represents single cell in board. Cell stores information about it place on game board and state of life @see {@link com.github.travelervihaan.gameoflife.cells.CellState}.
 */
public interface ICell {

    /**
     * Share current status of cell: alive / dead
     * @return cell status
     */
    boolean changeCellState();

    /**
     * Return location of cell as array of coordinates X and Y
     * @return an array of coordinates X and Y
     */
    int[] getLocation();

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
}
