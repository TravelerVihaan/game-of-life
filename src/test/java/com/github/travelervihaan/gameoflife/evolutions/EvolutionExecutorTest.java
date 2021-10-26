package com.github.travelervihaan.gameoflife.evolutions;


import com.github.travelervihaan.gameoflife.board.IBoard;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;


/**
 * Parasoft Jtest UTA: Test class for EvolutionExecutor
 *
 * @see EvolutionExecutor
 * @author abcd-
 */
public class EvolutionExecutorTest
{
    /**
     * Parasoft Jtest UTA: Test for performEvolution(IBoard)
     *
     * @author abcd-
     * @see EvolutionExecutor#performEvolution(IBoard)
     */
    @Test
    public void testPerformEvolution() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            EvolutionExecutor underTest = new EvolutionExecutor();

            // When
            IBoard board = mock(IBoard.class);
            underTest.performEvolution(board);

        });
    }
}