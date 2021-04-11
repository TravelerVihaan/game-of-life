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
     * Returns neighbour cells of the cell object. Number of neighbours depends on position of cell on game board
     * @return an array of neighbour cells objects.
     */
    Cell[] getNeighbours();

    /**
     * Returns information about state of cell - alive /dead
     * @return boolean value: true = alive, false - dead
     */
    boolean getCellState();
}
