package com.github.travelervihaan.gameoflife.board.printer;

import com.github.travelervihaan.gameoflife.board.IBoard;

public class BoardConsolePrinter implements IBoardPrinter {
    @Override
    public void printBoard(IBoard board) {
        System.out.println("Current board:");
        System.out.println(board);
    }
}
