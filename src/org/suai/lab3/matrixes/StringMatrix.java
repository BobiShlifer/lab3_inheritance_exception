package org.suai.lab3.matrixes;

import org.suai.lab3.Exception.MyException;

public class StringMatrix extends Matrix {

    public StringMatrix(int row, int column) {
        super(1, column);
        this.row = row;
        this.column = column;
        if ( row < 0 | column < 0) {
            throw  new MyException("Matrix size must be greater than 0");
        }
        
    }

    public  int getElement(int row, int column){
        if (row > this.row | column > this.column | row < 0 | column < 0 ) {
            MyException e = new MyException("Incorrect index!");
            throw e;
        }
        return this.data[0][column];
    }

    public  void setElement(int row, int column, int value){
        if (row > this.row | column > this.column | row < 0 | column < 0 ) {
            MyException e = new MyException("Incorrect index!");
            throw e;
        }
        this.data[0][column] = value;
    }
}
