package com.github.travelervihaan.gameoflife.board.creator;

import com.github.travelervihaan.gameoflife.board.Board;
import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.cells.Cell;
import com.github.travelervihaan.gameoflife.cells.CellState;
import com.github.travelervihaan.gameoflife.cells.Coordinates;
import com.github.travelervihaan.gameoflife.cells.ICell;

public class BoardCreator implements IBoardCreator {

    private final int size;
    private final ICell[][] boardCells;

    public BoardCreator(int size) {
        this.size = size;
        this.boardCells = new ICell[size][size];
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

        return new Cell(cellState, x, y);
    }


    public ICell[][] getBoardCells() {
        return boardCells;
    }

    public IBoard createBoard(){
        return new Board(boardCells, size);
    }
}
