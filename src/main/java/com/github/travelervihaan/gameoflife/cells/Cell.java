package com.github.travelervihaan.gameoflife.cells;

public class Cell implements ICell {

    private CellState cellState;
    private final Coordinates coordinates;
    private final Cell[] neighbours;

    public Cell(CellState state, int locationX, int locationY, int neighboursCount) {
        cellState = state;
        coordinates = new Coordinates(locationX, locationY);
        neighbours = new Cell[neighboursCount];
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
    public Cell[] getNeighbours() {
        return neighbours;
    }

    @Override
    public boolean getCellState() {
        return cellState.getCellState();
    }
}
