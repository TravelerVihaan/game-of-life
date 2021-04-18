package com.github.travelervihaan.gameoflife.cells;

public class Cell implements ICell {

    private CellState cellState;
    private final Coordinates coordinates;
    private final CellPosition cellPosition;

    public Cell(CellState cellState, Coordinates coordinates, CellPosition cellPosition) {
        this.cellState = cellState;
        this.coordinates = coordinates;
        this.cellPosition = cellPosition;
    }

    @Override
    public boolean changeCellState(){
        boolean changedState = !cellState.getCellState();
        if (cellState != CellState.ALIVE) cellState = CellState.ALIVE;
        else cellState = CellState.DEAD;
        return changedState;
    }

    @Override
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public int getLocationX() {
        return coordinates.getCoordinateX();
    }

    @Override
    public int getLocationY() {
        return coordinates.getCoordinateY();
    }

    public CellPosition getCellPosition() {
        return cellPosition;
    }

    @Override
    public boolean getCellState() {
        return cellState.getCellState();
    }
}
