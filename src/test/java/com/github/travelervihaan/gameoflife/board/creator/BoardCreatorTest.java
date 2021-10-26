/**
 * 
 */
package com.github.travelervihaan.gameoflife.board.creator;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import com.github.travelervihaan.gameoflife.board.IBoard;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for BoardCreator
 *
 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreator
 * @author abcd-
 */
public class BoardCreatorTest {

	/**
	 * Parasoft Jtest UTA: Test for initializeBoard()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreator#initializeBoard()
	 * @author abcd-
	 */
	@Test
	public void testInitializeBoard() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			int size = -1; // UTA: provided value
			BoardCreator underTest = new BoardCreator(size);

			// When
			IBoard result = underTest.initializeBoard();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for initializeBoard()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreator#initializeBoard()
	 * @author abcd-
	 */
	@Test
	public void testInitializeBoard2() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			int size = 1; // UTA: provided value
			BoardCreator underTest = new BoardCreator(size);

			// When
			IBoard result = underTest.initializeBoard();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for initializeBoard()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreator#initializeBoard()
	 * @author abcd-
	 */
	@Test
	public void testInitializeBoard3() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			int size = 2; // UTA: provided value
			BoardCreator underTest = new BoardCreator(size);

			// When
			IBoard result = underTest.initializeBoard();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for initializeBoard()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.creator.BoardCreator#initializeBoard()
	 * @author abcd-
	 */
	@Test
	public void testInitializeBoard4() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			int size = 3; // UTA: provided value
			BoardCreator underTest = new BoardCreator(size);

			// When
			IBoard result = underTest.initializeBoard();

		});
	}
}