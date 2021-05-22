package com.github.travelervihaan.gameoflife.game;

import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.board.printer.BoardConsolePrinter;
import com.github.travelervihaan.gameoflife.board.printer.IBoardPrinter;
import com.github.travelervihaan.gameoflife.evolutions.EvolutionExecutor;
import com.github.travelervihaan.gameoflife.evolutions.IEvolutionExecutor;

public final class GameBuilder {
    private IBoardPrinter boardPrinter;
    private IEvolutionExecutor evolutionExecutor;

    public static IGame buildDefaultGame(IBoard board){
        return new Game(board, new EvolutionExecutor(), new BoardConsolePrinter());
    }
}

