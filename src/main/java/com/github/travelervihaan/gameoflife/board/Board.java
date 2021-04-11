package com.github.travelervihaan.gameoflife.board;

import com.github.travelervihaan.gameoflife.cells.Cell;
import com.github.travelervihaan.gameoflife.cells.CellState;
import com.github.travelervihaan.gameoflife.cells.ICell;

public class Board implements IBoard {

    private final int size;
    private final ICell[][] boardCells;

    public Board(int size) {
        this.size = size;
        this.boardCells = new Cell[size][size];
    }

    @Override
    public void drawBoard() {
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) boardCells[i][j] = createCell(i, j);
        }
    }

    private ICell createCell(int x, int y){
        boolean bState = Math.random() < 0.7;
        CellState cellState = bState ? CellState.ALIVE : CellState.DEAD;
        int neighbours = calculateNeighbours(x, y);
        return new Cell(cellState, x, y, neighbours);
    }

    private int calculateNeighbours(int x, int y){
        return 1;
    }

    public ICell[][] getBoardCells() {
        return boardCells;
    }
}
