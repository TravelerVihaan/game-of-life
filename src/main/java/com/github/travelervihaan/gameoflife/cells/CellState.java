package com.github.travelervihaan.gameoflife.cells;

import com.github.travelervihaan.gameoflife.util.ILiteralConstants;

public enum CellState {
    ALIVE(true, ILiteralConstants.PRINTABLE_ALIVE_STATE),
    DEAD(false, ILiteralConstants.PRINTABLE_DEAD_STATE);

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
}
