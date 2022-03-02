package org.suai.lab3;

import org.suai.lab3.Exception.MyException;
import org.suai.lab3.matrixes.Matrix;
import org.suai.lab3.matrixes.SquareMatrix;
import org.suai.lab3.matrixes.StringMatrix;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix(4, 2);
        SquareMatrix sm2 = new SquareMatrix(2);
        m.setElement(0,0,1);
        m.setElement(2,0,7);
        m.setElement(1,1,5);
        m.setElement(3,1,9);
        sm2.setElement(0,0,1);
        sm2.setElement(0,1,2);
        sm2.setElement(1,0,3);
        sm2.setElement(1,1,4);
   /*
    StringMatrix y = new StringMatrix(2,2);
	y.setElement(0,0,3);
	System.out.println(y);
    System.out.println(y.getElement(0,1));

    System.out.println(m.sum(y));
    System.out.println(m.product(y));
	SquareMatrix t = new SquareMatrix(5);
	*/
        try {
        /*Matrix n = new Matrix(3,2);
        n.setElement(0,0,1);
        n.setElement(1,0,5);
        n.setElement(2,0,8);
        n.setElement(1,1,7);
        System.out.println(n);

        Matrix b = new Matrix(2,4);
        b.setElement(0,0,4);
        b.setElement(0,2,2);
        b.setElement(1,1,6);
        System.out.println(b);
        System.out.println(n.product(b));
	System.out.println("Sum is:");
        System.out.println(m.sum(t));
        System.out.println(n.equals(b));
        System.out.println(m.product(b));

         */
            System.out.println(m.product(sm2));

        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();


        }

    }

}

