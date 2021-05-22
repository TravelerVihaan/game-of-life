package com.github.travelervihaan.gameoflife.cells;

import java.util.Arrays;
import java.util.Objects;

public class Cell implements ICell {

    private final CellState[] cellStates;
    private final Coordinates coordinates;

    public Cell(CellState cellState, Coordinates coordinates){
        this(cellState, coordinates.coordinateX(), coordinates.coordinateY());
    }

    public Cell(CellState cellState, int x, int y) {
        this.cellStates = initCellState(cellState);
        this.coordinates = new Coordinates(x, y);
    }

    @Override
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String print() {
        return getCurrentCellState().getPrintableState();
    }

    @Override
    public void updateCellState() {
        cellStates[0] = cellStates[1];
        cellStates[1] = null;
    }

    @Override
    public int getLocationX() {
        return coordinates.getCoordinateX();
    }

    @Override
    public int getLocationY() {
        return coordinates.getCoordinateY();
    }

    @Override
    public CellState getCurrentCellState() {
        return cellStates[0];
    }

    @Override
    public CellState getNextCellState() {
        return cellStates[1];
    }

    @Override
    public void calculateNewCellState(long aliveNeighbours) {
        if(getCurrentCellState() == CellState.ALIVE && (aliveNeighbours == 2 || aliveNeighbours == 3)){
            cellStates[1] = CellState.ALIVE;
        } else if(getCurrentCellState() == CellState.DEAD && aliveNeighbours == 3){
            cellStates[1] = CellState.ALIVE;
        } else {
            cellStates[1] = CellState.DEAD;
        }
    }

    private CellState[] initCellState(CellState initialCellState){
        return new CellState[]{initialCellState, null};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Arrays.equals(cellStates, cell.cellStates) && Objects.equals(coordinates, cell.coordinates);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(coordinates);
        result = 31 * result + Arrays.hashCode(cellStates);
        return result;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellStates=" + Arrays.toString(cellStates) +
                ", coordinates=" + coordinates +
                '}';
    }
}
