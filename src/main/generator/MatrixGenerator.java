package generator;

import matrix.Matrix;

import java.util.ArrayList;

/**
 * Created by Aäron & Laurien on 24/11/2017.
 */
public class MatrixGenerator {

    public Matrix genereer(int rijen, int kolommen, ArrayList<Integer> getallen) {
        Matrix matrix = new Matrix(rijen, kolommen);
        matrix.vulRandom(getallen);
        return matrix;
    }
}
