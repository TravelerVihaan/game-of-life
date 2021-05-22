package com.github.travelervihaan.gameoflife.starter;

import com.github.travelervihaan.gameoflife.board.creator.BoardCreatorFactory;
import com.github.travelervihaan.gameoflife.board.creator.IBoardCreator;
import com.github.travelervihaan.gameoflife.game.GameBuilder;
import com.github.travelervihaan.gameoflife.game.IGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameOfLifeStarter implements IStarter {

    @Override
    public void start(){
        IBoardCreator boardCreator = BoardCreatorFactory.createDefaultBoardCreator(getBoardSizeFromKeyboard());
        IGame game = GameBuilder.buildDefaultGame(boardCreator.initializeBoard());
        game.playGame();
    }

    /**
     * Ask an user for provide integer number from keyboard to set size of game board.
     * If provided number will be in incorrect format (e.g. will contain some commas or other signs which are not numbers,
     * then size will be set as default value (10)
     * @return size read from keyboard or default value instead (if provided data has unexpected format)
     */
    private int getBoardSizeFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PROVIDE_BOARD_SIZE_MESSAGE);
        int size = DEFAULT_BOARD_SIZE;
        try{
            size = scanner.nextInt();
        }catch (InputMismatchException ime) {
            System.err.println(WRONG_PROVIDED_SIZE_FORMAT_MESSAGE);
        }
        return size;
    }

    private static final int DEFAULT_BOARD_SIZE = 10;

    private static final String PROVIDE_BOARD_SIZE_MESSAGE = "Provide the size of game board. Board is a square, so declared size will be length and width\n";
    private static final String WRONG_PROVIDED_SIZE_FORMAT_MESSAGE = "Provided value has wrong format. Only integer numbers are accepted\n";
}
