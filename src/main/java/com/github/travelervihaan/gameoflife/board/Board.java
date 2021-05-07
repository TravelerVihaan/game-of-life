package com.github.travelervihaan.gameoflife.board;

import com.github.travelervihaan.gameoflife.cells.Cell;
import com.github.travelervihaan.gameoflife.cells.CellPosition;
import com.github.travelervihaan.gameoflife.cells.CellState;
import com.github.travelervihaan.gameoflife.cells.Coordinates;
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
        Coordinates coordinates = new Coordinates(x, y);
        CellPosition cellPosition = calculateCellPosition(x, y);
        return new Cell(cellState, x, y, cellPosition);
    }

    private CellPosition calculateCellPosition(int x, int y){
        if(x == 0){
            if(y == 0){
                return CellPosition.TOP_LEFT_CORNER;
            } else if(y == size){
                return CellPosition.TOP_RIGHT_CORNER;
            } else {
                return CellPosition.LEFT;
            }
        }
    return null;
    }

    public ICell[][] getBoardCells() {
        return boardCells;
    }
}
