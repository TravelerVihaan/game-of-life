package com.github.travelervihaan.gameoflife.starter;

import com.github.travelervihaan.gameoflife.board.Board;
import com.github.travelervihaan.gameoflife.board.IBoard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameOfLifeStarter implements IStarter {

    public void start(){
        IBoard board = new Board(getBoardSizeFromKeyboard());
    }

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
