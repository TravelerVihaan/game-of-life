package com.github.travelervihaan.gameoflife.game;

import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.evolutions.EvolutionExecutor;
import com.github.travelervihaan.gameoflife.evolutions.IEvolutionExecutor;

public class Game implements IGame {

    @Override
    public void playGame(IBoard board) {
        IEvolutionExecutor evolutionExecutor = new EvolutionExecutor();
    }
}
