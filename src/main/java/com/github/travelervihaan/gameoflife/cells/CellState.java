package com.github.travelervihaan.gameoflife.cells;

public enum CellState {
    ALIVE(true, CellState.PRINTABLE_ALIVE_STATE),
    DEAD(false, CellState.PRINTABLE_DEAD_STATE);

    private final boolean cellState;
    private final String printableState;

    CellState(boolean cellState, String printableState){
        this.cellState = cellState;
        this.printableState = printableState;
    }

    public boolean getCellState() {
        return cellState;
    }

    public String getPrintableState() {
        return printableState;
    }

    private static final String PRINTABLE_ALIVE_STATE = "[o]";
    private static final String PRINTABLE_DEAD_STATE = "[x]";
}
