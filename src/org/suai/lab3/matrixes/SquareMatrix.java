package org.suai.lab3.matrixes;

import org.suai.lab3.Exception.MyException;
import org.suai.lab3.matrixes.Matrix;

public class SquareMatrix extends Matrix {

    protected int row;

    public SquareMatrix(int row) {
        super (row,row);
        for(int i = 0; i < row; i++) {
                for(int j = 0; j < row; j++) {
                    if(i == j)
                        data[i][j] = 1;
                }
            }
        }

    public SquareMatrix sum(SquareMatrix m){
        if ( this.row != m.row & this.column != m.column) {
            throw  new MyException("Matrix sizes  are different!");
        }
        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < this.column; j++) {
                this.data[i][j] += m.data[i][j];
            }
        }
        return this;
    }
}



