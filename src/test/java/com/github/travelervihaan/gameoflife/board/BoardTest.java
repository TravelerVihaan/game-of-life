/**
 * 
 */
package com.github.travelervihaan.gameoflife.board;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.github.travelervihaan.gameoflife.cells.ICell;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for Board
 *
 * @see com.github.travelervihaan.gameoflife.board.Board
 * @author abcd-
 */
public class BoardTest {

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#equals(Object)
	 * @author abcd-
	 */
	@Test
	public void testEquals() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 0; // UTA: default value
			Board underTest = new Board(cells, size);

			// When
			Object o = null; // UTA: provided value
			boolean result = underTest.equals(o);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for equals(Object)
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#equals(Object)
	 * @author abcd-
	 */
	@Test
	public void testEquals2() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 0; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			Board o = mock(Board.class);
			boolean result = underTest.equals(o);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getBoardCells()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#getBoardCells()
	 * @author abcd-
	 */
	@Test
	public void testGetBoardCells() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 0; // UTA: default value
			Board underTest = new Board(cells, size);

			// When
			ICell[][] result = underTest.getBoardCells();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getCell(int, int)
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#getCell(int, int)
	 * @author abcd-
	 */
	@Test
	public void testGetCell() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 0; // UTA: default value
			Board underTest = new Board(cells, size);

			// When
			int x = 0; // UTA: default value
			int y = 0; // UTA: default value
			ICell result = underTest.getCell(x, y);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getSize()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#getSize()
	 * @author abcd-
	 */
	@Test
	public void testGetSize() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 0; // UTA: default value
			Board underTest = new Board(cells, size);

			// When
			int result = underTest.getSize();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for hashCode()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#hashCode()
	 * @author abcd-
	 */
	@Test
	public void testHashCode() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 0; // UTA: default value
			Board underTest = new Board(cells, size);

			// When
			int result = underTest.hashCode();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#toString()
	 * @author abcd-
	 */
	@Test
	public void testToString() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = -1; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			String result = underTest.toString();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#toString()
	 * @author abcd-
	 */
	@Test
	public void testToString2() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 1; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			String result = underTest.toString();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for toString()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#toString()
	 * @author abcd-
	 */
	@Test
	public void testToString3() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 2; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			String result = underTest.toString();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for updateBoardCells()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#updateBoardCells()
	 * @author abcd-
	 */
	@Test
	public void testUpdateBoardCells() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = -1; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			underTest.updateBoardCells();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for updateBoardCells()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#updateBoardCells()
	 * @author abcd-
	 */
	@Test
	public void testUpdateBoardCells2() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 1; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			underTest.updateBoardCells();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for updateBoardCells()
	 *
	 * @see com.github.travelervihaan.gameoflife.board.Board#updateBoardCells()
	 * @author abcd-
	 */
	@Test
	public void testUpdateBoardCells3() throws Throwable {
		assertTimeoutPreemptively(ofMillis(1000), () -> {
			// Given
			ICell[][] cells = new com.github.travelervihaan.gameoflife.cells.ICell[0][]; // UTA: default value
			int size = 2; // UTA: provided value
			Board underTest = new Board(cells, size);

			// When
			underTest.updateBoardCells();

		});
	}
}