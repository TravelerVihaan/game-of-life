package com.github.travelervihaan.gameoflife.board;

import com.github.travelervihaan.gameoflife.cells.ICell;

import java.util.Arrays;
import java.util.Objects;

public class Board implements IBoard {

    private final ICell[][] cells;
    private final int size;

    public Board(ICell[][] cells, int size) {
        this.cells = cells;
        this.size = size;
    }

    @Override
    public ICell[][] getBoardCells() {
        return new ICell[0][];
    }

    @Override
    public ICell[][] getCell() {
        return new ICell[0][];
    }

    @Override
    public int getSize() {
        return size;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return size == board.size && Arrays.equals(cells, board.cells);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(cells);
        return result;
    }

    @Override
    public String toString() {
        return "Board{" +
                "cells=" + Arrays.toString(cells) +
                ", size=" + size +
                '}';
    }
}
