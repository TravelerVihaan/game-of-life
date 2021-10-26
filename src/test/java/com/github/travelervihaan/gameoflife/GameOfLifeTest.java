package com.github.travelervihaan.gameoflife;


import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;


/**
 * Parasoft Jtest UTA: Test class for GameOfLife
 *
 * @see GameOfLife
 * @author abcd-
 */
public class GameOfLifeTest
{
    /**
     * Parasoft Jtest UTA: Test for main(String[])
     *
     * @author abcd-
     * @see GameOfLife#main(String[])
     */
    @Test
    public void testMain() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // When
            String[] args = new java.lang.String[0]; // UTA: default value
            GameOfLife.main(args);

        });
    }
}