package com.github.travelervihaan.gameoflife.board;

public class BoardCreatorFactory {

    public static IBoardCreator createDefaultBoardCreator(){
        return createDefaultBoardCreator(10);
    }

    public static IBoardCreator createDefaultBoardCreator(int boardSize){
        return new BoardCreator(boardSize);
    }
}
