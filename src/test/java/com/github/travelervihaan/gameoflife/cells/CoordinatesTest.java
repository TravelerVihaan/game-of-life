package com.github.travelervihaan.gameoflife.cells;


import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;


/**
 * Parasoft Jtest UTA: Test class for Coordinates
 *
 * @see Coordinates
 * @author abcd-
 */
public class CoordinatesTest
{
    /**
     * Parasoft Jtest UTA: Test for coordinateX()
     *
     * @author abcd-
     * @see Coordinates#coordinateX()
     */
    @Test
    public void testCoordinateX() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            int result = underTest.coordinateX();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for coordinateY()
     *
     * @author abcd-
     * @see Coordinates#coordinateY()
     */
    @Test
    public void testCoordinateY() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            int result = underTest.coordinateY();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for equals(Object)
     *
     * @author abcd-
     * @see Coordinates#equals(Object)
     */
    @Test
    public void testEquals() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            Object o = new Object(); // UTA: default value
            boolean result = underTest.equals(o);

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getCoordinateX()
     *
     * @author abcd-
     * @see Coordinates#getCoordinateX()
     */
    @Test
    public void testGetCoordinateX() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            int result = underTest.getCoordinateX();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getCoordinateY()
     *
     * @author abcd-
     * @see Coordinates#getCoordinateY()
     */
    @Test
    public void testGetCoordinateY() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            int result = underTest.getCoordinateY();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for getCoordinates()
     *
     * @author abcd-
     * @see Coordinates#getCoordinates()
     */
    @Test
    public void testGetCoordinates() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            int[] result = underTest.getCoordinates();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for hashCode()
     *
     * @author abcd-
     * @see Coordinates#hashCode()
     */
    @Test
    public void testHashCode() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            int result = underTest.hashCode();

        });
    }

    /**
     * Parasoft Jtest UTA: Test for toString()
     *
     * @author abcd-
     * @see Coordinates#toString()
     */
    @Test
    public void testToString() throws Throwable {
        assertTimeoutPreemptively(ofMillis(1000), () -> {
            // Given
            int coordinateX = 0; // UTA: default value
            int coordinateY = 0; // UTA: default value
            Coordinates underTest = new Coordinates(coordinateX, coordinateY);

            // When
            String result = underTest.toString();

        });
    }
}