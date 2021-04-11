package com.github.travelervihaan.gameoflife;

import com.github.travelervihaan.gameoflife.starter.GameOfLifeStarter;
import com.github.travelervihaan.gameoflife.starter.IStarter;

class GameOfLife {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame(){
        IStarter gameStarter = new GameOfLifeStarter();
        gameStarter.start();
    }
}
