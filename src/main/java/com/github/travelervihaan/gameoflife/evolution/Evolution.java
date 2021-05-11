package com.github.travelervihaan.gameoflife.evolution;

import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.board.creator.BoardCreator;
import com.github.travelervihaan.gameoflife.board.creator.BoardCreatorFactory;

public class Evolution implements IEvolution {

	@Override
	public IBoard performEvolution(IBoard inputBoard) {
		IBoard outputBoard = BoardCreatorFactory.createDefaultBoardCreator(inputBoard.
	}

}