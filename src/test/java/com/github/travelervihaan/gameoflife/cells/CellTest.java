package com.github.travelervihaan.gameoflife.cells;


import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;


/**
 * Parasoft Jtest UTA: Test class for Cell
 *
 * @see Cell
 * @author abcd-
 */
public class CellTest
{
    /**
     * Parasoft Jtest UTA: Test for calculateNewCellState(long)
     *
     * @author abcd-
     * @see Cell#calculateNewCellState(long)
     */
    @Test
    public void testCalculateNewCellState() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            long aliveNeighbours = 0L; // UTA: default value
            underTest.calculateNewCellState(aliveNeighbours);

        });
    }

    /**
     * Parasoft Jtest UTA: Test for equals(Object)
     *
     * @author abcd-
     * @see Cell#equals(Object)
     */
    @Test
    public void testEquals() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            Object o = new Object(); // UTA: default value
            boolean result = underTest.equals(o);

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getCoordinates()
     *
     * @author abcd-
     * @see Cell#getCoordinates()
     */
    @Test
    public void testGetCoordinates() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            Coordinates result = underTest.getCoordinates();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getCurrentCellState()
     *
     * @author abcd-
     * @see Cell#getCurrentCellState()
     */
    @Test
    public void testGetCurrentCellState() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            CellState result = underTest.getCurrentCellState();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getLocationX()
     *
     * @author abcd-
     * @see Cell#getLocationX()
     */
    @Test
    public void testGetLocationX() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            int result = underTest.getLocationX();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getLocationY()
     *
     * @author abcd-
     * @see Cell#getLocationY()
     */
    @Test
    public void testGetLocationY() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            int result = underTest.getLocationY();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getNextCellState()
     *
     * @author abcd-
     * @see Cell#getNextCellState()
     */
    @Test
    public void testGetNextCellState() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            CellState result = underTest.getNextCellState();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for hashCode()
     *
     * @author abcd-
     * @see Cell#hashCode()
     */
    @Test
    public void testHashCode() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            int result = underTest.hashCode();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for print()
     *
     * @author abcd-
     * @see Cell#print()
     */
    @Test
    public void testPrint() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            String result = underTest.print();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for toString()
     *
     * @author abcd-
     * @see Cell#toString()
     */
    @Test
    public void testToString() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            String result = underTest.toString();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for updateCellState()
     *
     * @author abcd-
     * @see Cell#updateCellState()
     */
    @Test
    public void testUpdateCellState() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState cellState = CellState.ALIVE; // UTA: default value
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates coordinates = new Coordinates(coordinateX, coordinateY);
            Cell underTest = new Cell(cellState, coordinates);

            // When
            underTest.updateCellState();

        });
    }
}