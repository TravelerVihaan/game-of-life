package com.github.travelervihaan.gameoflife.cells;

public enum CellState {
    ALIVE(true),
    DEAD(false);

    private boolean cellState;

    CellState(boolean cellState){
        this.cellState = cellState;
    }

    boolean getCellState() {
        return cellState;
    }

    void setCellState(boolean cellState) {
        this.cellState = cellState;
    }
}
