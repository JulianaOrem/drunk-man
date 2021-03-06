package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

public class Position extends AbstractGridPosition {

    private PacGrid grid;


    public Position(PacGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        this.grid = grid;

    }

    public Position(int col, int row, PacGrid grid){
        super(col, row, grid);
        this.grid = grid;
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public boolean equals(GridPosition pos) {
        if (getCol() == pos.getCol() && getRow() == pos.getRow()){
            return true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        Integer col = getCol();
        Integer row = getRow();
        String coordinates = col.toString() + "." + row.toString();
        return coordinates.hashCode();
    }
}
