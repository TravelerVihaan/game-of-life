package com.github.travelervihaan.gameoflife.cells;


import com.github.travelervihaan.gameoflife.util.ILiteralConstants;

public class Cell implements ICell {

    private CellState cellState;

    private final Coordinates coordinates;

    private Cell[] neighbours = new Cell[8];

    public Cell(CellState cellState, int locationX, int locationY) {
        this.cellState = cellState;
        coordinates = new Coordinates(locationX, locationY);
    }

    @Override
    public boolean changeCellState(){
        boolean changedState = !cellState.getCellState();
        cellState.setCellState(changedState);
        return changedState;
    }

    @Override
    public int[] getLocation(){
        return coordinates.getCoordinates();
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
    public String toString() {
        return "Cell{" +
                "cellState=" + cellState +
                '}';
    }
}
