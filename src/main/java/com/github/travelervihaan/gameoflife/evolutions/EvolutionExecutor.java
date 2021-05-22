package com.github.travelervihaan.gameoflife.evolutions;

import com.github.travelervihaan.gameoflife.board.IBoard;
import com.github.travelervihaan.gameoflife.cells.CellState;
import com.github.travelervihaan.gameoflife.cells.Coordinates;
import com.github.travelervihaan.gameoflife.cells.ICell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvolutionExecutor implements IEvolutionExecutor {

    @Override
    public void performEvolution(IBoard board){
        System.out.println("Performing evolution...");
        List<ICell> cells = Arrays.stream(board.getBoardCells()).flatMap(Arrays::stream).toList();
        cells.forEach(cell -> calculateNextCellState(cell, board));
    }

    private void calculateNextCellState(ICell cell, IBoard board) {
        List<CellState> neighboursStates = getNeighboursStates(cell.getCoordinates(), board);
        long aliveNeighbours = neighboursStates.stream().filter(cellState -> cellState==CellState.ALIVE).count();
        board.getCell(cell.getCoordinates()).calculateNewCellState(aliveNeighbours);
    }

    private List<CellState> getNeighboursStates(Coordinates cellCoords, IBoard board) {
        List<CellState> neighboursStates = new ArrayList<>();
        for (int y = cellCoords.coordinateY() - 1; y <= cellCoords.coordinateY() + 1; y++) {
            for (int x = cellCoords.coordinateX() - 1; x <= cellCoords.coordinateX() + 1; x++) {

                if (x == cellCoords.coordinateX() || y == cellCoords.coordinateY()) continue;

                if(isCellOnBoardScope(x, y, board.getSize())) {
                    Coordinates cords = new Coordinates(x, y);
                    neighboursStates.add(board.getCell(cords).getCurrentCellState());
                }
            }
        }
        return neighboursStates;
    }

    private boolean isCellOnBoardScope(int x, int y, int size){
        return isCoordinateOnBoardScope(x, size) && isCoordinateOnBoardScope(y, size);
    }

    private boolean isCoordinateOnBoardScope(int coordinate, int size){
        return coordinate >= 0 && coordinate <= size;
    }
}
