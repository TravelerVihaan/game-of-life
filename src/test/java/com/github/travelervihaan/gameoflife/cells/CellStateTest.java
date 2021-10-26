package com.github.travelervihaan.gameoflife.cells;


import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;


/**
 * Parasoft Jtest UTA: Test class for CellState
 *
 * @see CellState
 * @author abcd-
 */
public class CellStateTest
{
    /**
     * Parasoft Jtest UTA: Test for getCellState()
     *
     * @author abcd-
     * @see CellState#getCellState()
     */
    @Test
    public void testGetCellState() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState underTest = CellState.ALIVE;

            // When
            boolean result = underTest.getCellState();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getPrintableState()
     *
     * @author abcd-
     * @see CellState#getPrintableState()
     */
    @Test
    public void testGetPrintableState() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            CellState underTest = CellState.ALIVE;

            // When
            String result = underTest.getPrintableState();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for valueOf(String)
     *
     * @author abcd-
     * @see CellState#valueOf(String)
     */
    @Test
    public void testValueOf() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // When
            String name = "name"; // UTA: default value
            CellState result = CellState.valueOf(name);

        });
    }

    /**
     * Parasoft Jtest UTA: Test for values()
     *
     * @author abcd-
     * @see CellState#values()
     */
    @Test
    public void testValues() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // When
            CellState[] result = CellState.values();

        });
    }
}