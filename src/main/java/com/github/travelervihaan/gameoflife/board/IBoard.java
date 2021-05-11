package com.github.travelervihaan.gameoflife.board;

import com.github.travelervihaan.gameoflife.cells.ICell;

public interface IBoard {
    ICell[][] getBoardCells();

    ICell[][] getCell();
 }
