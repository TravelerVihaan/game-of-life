package com.github.travelervihaan.gameoflife.cells;


public enum CellPosition {
    TOP_RIGHT_CORNER(3),
    TOP_LEFT_CORNER(3),
    BOTTOM_RIGHT_CORNER(3),
    BOTTOM_LEFT_CORNER(3),
    TOP(5),
    LEFT(5),
    RIGHT(5),
    BOTTOM(5),
    COMMON(8);

    private final int neighboursCount;

    CellPosition(int neighboursCount){
        this.neighboursCount = neighboursCount;
    }

    public int getNeighboursCount() {
        return neighboursCount;
    }
}
