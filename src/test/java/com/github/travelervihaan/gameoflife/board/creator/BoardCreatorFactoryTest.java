/**
 * 
 */
package com.github.travelervihaan.gameoflife.board.creator;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for BoardCreatorFactory
 *
 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreatorFactory
 * @author abcd-
 */
public class BoardCreatorFactoryTest {

	/**
	 * Parasoft Jtest UTA: Test for createDefaultBoardCreator()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreatorFactory#createDefaultBoardCreator()
	 * @author abcd-
	 */
	@Test
	public void testCreateDefaultBoardCreator() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// When
			IBoardCreator result = BoardCreatorFactory.createDefaultBoardCreator();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for createDefaultBoardCreator(int)
	 *
	 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreatorFactory#createDefaultBoardCreator(int)
	 * @author abcd-
	 */
	@Test
	public void testCreateDefaultBoardCreator2() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// When
			int boardSize = 0; // UTA: default value
			IBoardCreator result = BoardCreatorFactory.createDefaultBoardCreator(boardSize);

		});
	}
}