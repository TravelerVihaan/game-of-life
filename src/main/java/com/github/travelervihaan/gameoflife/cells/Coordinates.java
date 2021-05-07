package com.github.travelervihaan.gameoflife.cells;

import java.util.Objects;

public record Coordinates(int coordinateX, int coordinateY) {

    int getCoordinateX() {
        return coordinateX;
    }

    int getCoordinateY() {
        return coordinateY;
    }

    int[] getCoordinates(){
        return new int[]{coordinateX, coordinateY};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return coordinateX == that.coordinateX && coordinateY == that.coordinateY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinateA=" + coordinateX +
                ", coordinateB=" + coordinateY +
                '}';
    }
}
