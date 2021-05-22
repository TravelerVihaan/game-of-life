package com.github.travelervihaan.gameoflife.game;

import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.board.printer.IBoardPrinter;
import com.github.travelervihaan.gameoflife.evolutions.IEvolutionExecutor;

import java.io.IOException;

public class Game implements IGame {

    private final IBoard board;
    private final IEvolutionExecutor evolutionExecutor;
    private final IBoardPrinter boardPrinter;

    Game(IBoard board, IEvolutionExecutor evolutionExecutor, IBoardPrinter boardPrinter){
        this.board = board;
        this.boardPrinter = boardPrinter;
        this.evolutionExecutor = evolutionExecutor;
    }

    @Override
    public void playGame() {

        while(true){
            boardPrinter.printBoard(board);
            try {
                System.in.read();
            } catch (IOException e) {
                System.err.println("An error occurred while waiting for key press");
            }
            evolutionExecutor.performEvolution(board);
            board.updateBoardCells();
        }
    }


}
