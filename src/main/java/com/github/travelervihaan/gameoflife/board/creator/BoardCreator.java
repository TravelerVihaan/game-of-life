package com.github.travelervihaan.gameoflife.board.creator;

import com.github.travelervihaan.gameoflife.board.Board;
import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.cells.Cell;
import com.github.travelervihaan.gameoflife.cells.CellState;
import com.github.travelervihaan.gameoflife.cells.Coordinates;
import com.github.travelervihaan.gameoflife.cells.ICell;

class BoardCreator implements IBoardCreator {

    private final int size;
    private final ICell[][] boardCells;

    public BoardCreator(int size) {
        this.size = size;
        this.boardCells = new ICell[size][size];
    }

    @Override
    public IBoard initializeBoard() {
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) boardCells[i][j] = createCell(i, j);
        }
        return createBoard();
    }

    private ICell createCell(int x, int y){
        boolean bState = Math.random() <= 0.3;
        CellState cellState = bState ? CellState.ALIVE : CellState.DEAD;
        Coordinates coordinates = new Coordinates(x, y);
        return new Cell(cellState, coordinates);
    }

    private IBoard createBoard(){
        return new Board(boardCells, size);
    }
}
