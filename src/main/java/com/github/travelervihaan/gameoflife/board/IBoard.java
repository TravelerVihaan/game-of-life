package com.github.travelervihaan.gameoflife.board;

import com.github.travelervihaan.gameoflife.cells.ICell;

public interface IBoard {
    ICell[][] getBoardCells();

    ICell[][] getCell();
    
    int getSize();
    
    /**
     * Puts new cell object in place with its coordinates. If calculated place is empty, just put it there. If there is any other cell, newest replacing the existing one
     * 
     * @param newCell 
     */
    void insertCell(ICell newCell);
 }
