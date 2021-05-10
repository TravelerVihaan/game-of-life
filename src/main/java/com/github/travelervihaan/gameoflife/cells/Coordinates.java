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

    private boolean isInCorner(int size){
        if(coordinateX == size && coordinateY == size)
            return true;
        else if (coordinateX == 1 && coordinateY == size)
            return true;
        else return coordinateX == 1 && coordinateY == 1;
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
