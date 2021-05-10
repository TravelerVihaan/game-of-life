package com.github.travelervihaan.gameoflife.cells;

public class Cell implements ICell {

    private CellState cellState;
    private final Coordinates coordinates;
    public Cell(CellState cellState, int x, int y) {
        this.cellState = cellState;
        this.coordinates = new Coordinates(x, y);
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

    @Override
    public boolean getCellState() {
        return cellState.getCellState();
    }
}
