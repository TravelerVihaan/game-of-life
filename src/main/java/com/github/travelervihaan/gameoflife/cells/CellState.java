package com.github.travelervihaan.gameoflife.cells;

public enum CellState {
    ALIVE(true),
    DEAD(false);

    private final boolean cellState;

    CellState(boolean cellState){
        this.cellState = cellState;
    }

    public boolean getCellState() {
        return cellState;
    }
}
