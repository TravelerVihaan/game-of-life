package com.github.travelervihaan.gameoflife.cells;

import com.github.travelervihaan.gameoflife.board.IBoard;

public class Cell implements ICell {

    private final CellState[] cellStates;
    private final Coordinates coordinates;

    public Cell(CellState cellState, int x, int y) {
        cellStates = new CellState[2];
        initCellState(cellState);
        this.coordinates = new Coordinates(x, y);
    }

//    @Override
//    public boolean updateCellState(){
////        boolean changedState = !cellState.getCellState();
////        if (cellState != CellState.ALIVE) cellState = CellState.ALIVE;
////        else cellState = CellState.DEAD;
////        return changedState;
//    }

    @Override
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public boolean updateCellState() {
        return false;
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
    public void calculateNewCellState(IBoard board) {

    }


    private void initCellState(CellState firstCellState){
        cellStates[0] = firstCellState;
        cellStates[1] = null;
    }
}
