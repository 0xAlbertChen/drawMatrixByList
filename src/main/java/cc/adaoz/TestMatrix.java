package cc.adaoz;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class TestMatrix {

  public static void main(String[] args) {

    double[][] doubles = new double[11][6];

    double[] oneRow =new double[6];

    for (int i = 0; i < oneRow.length; i++) {
      oneRow[i] = 1;
    }


    RealMatrix matrix = new Array2DRowRealMatrix(doubles);

    System.out.println(matrix);

    System.out.println(matrix.getRowMatrix(0));

    matrix.setEntry(5,5,5);

    System.out.println(matrix.getEntry(5, 5));

    matrix.setRow(1,oneRow);

    System.out.println(matrix);

    RealMatrix transposeMatrix = matrix.transpose();


    System.out.println(transposeMatrix);
    System.out.println(matrix);

  }
}
