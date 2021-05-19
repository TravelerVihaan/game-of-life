package com.github.travelervihaan.gameoflife.evolutions;

import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.board.creator.BoardCreatorFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EvolutionExecutorTest {

    IBoard board;

    @BeforeEach
    void setUp() {
        board = BoardCreatorFactory.createDefaultBoardCreator(3).initializeBoard();
    }

    @AfterEach
    void tearDown() {
        board = null;
    }

    @Test
    void performEvolutionOnCornerWithAllDeadNeighbours() {
        System.out.println(board);
    }
}