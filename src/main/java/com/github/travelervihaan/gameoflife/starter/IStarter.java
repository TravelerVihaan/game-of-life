package com.github.travelervihaan.gameoflife.starter;

import com.github.travelervihaan.gameoflife.board.IBoard;

/**
 * It is very general interface to define starters. It contains only one method declaration which should be used to start task under the specific starter's implementation
 */
public interface IStarter {

    /**
     * Starts main task connected with implementation of this interface
     */
    IBoard start();
}
