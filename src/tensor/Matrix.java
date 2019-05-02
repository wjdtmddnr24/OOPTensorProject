package tensor;

public interface Matrix extends Cloneable {
    int CONCAT_DIRECTION_HORIZONTAL = 0;
    int CONCAT_DIRECTION_VERTICAL = 1;


    void setMatrix(long row, long col, Double value) throws SizeLessThanZeroException;

    void setMatrix(long row, long col, Scalar scalar) throws SizeLessThanZeroException;

    void setMatrix(long row, long col, Double i, Double j) throws SizeLessThanZeroException;

    void setMatrix(long row, long col, Scalar i, Scalar j) throws SizeLessThanZeroException;

    void setMatrix(String csv) throws SizeLessThanZeroException, WrongCSVFormatException;

    void setMatrix(Double[][] arr) throws SizeLessThanZeroException;

    void setMatrix(Scalar[][] arr) throws SizeLessThanZeroException;

    void setMatrix(long n) throws SizeLessThanZeroException;//단위 행

    void update(long row, long col, Scalar scalar) throws IndexOutOfBoundException;

    Scalar getScalar(long row, long col) throws IndexOutOfBoundException;

    long getSizeRow();

    long getSizeCol();

    Matrix add(Matrix matrix) throws SizeMismatchException;

    Matrix mul(Matrix matrix, boolean isOperand) throws SizeMismatchException; // isOperand=true -> this.matrix X mul::matrix, isOperand=false -> mul::matrix X this.matrix

    static Matrix add(Matrix a, Matrix b) throws SizeMismatchException {
        return null;
    }

    static Matrix mul(Matrix a, Matrix b) throws SizeMismatchException {
        return null;
    }

    static Matrix concat(Matrix a, Matrix b, int direction) throws SizeMismatchException { //concat(a,b,Matrix.CONCAT_DIRECTION_HORIZONTAL)이런식으로
        if (direction == CONCAT_DIRECTION_HORIZONTAL) {

        } else if (direction == CONCAT_DIRECTION_VERTICAL) {

        } else {

        }
        return null;
    }

    Vector getVectorRow(long row) throws IndexOutOfBoundException;

    Vector getVectorCol(long col) throws IndexOutOfBoundException;

    Matrix getSubMatrix(long startRow, long startCol, long endRow, long endCol) throws IndexOutOfBoundException;

    Matrix getMinorMatrix(long row, long col) throws IndexOutOfBoundException;

    Matrix getTranspose();

    Scalar getTrace();

    boolean isSquareMatrix();

    boolean isUpperTriangleMatrix();

    boolean isLowerTriangleMatrix();

    boolean isIdentityMatrix();

    boolean isZeroMatrix();

    /* 아래 6개 기능은 기본행렬 곱해서 만들면 쉽다.  */
    Matrix rowSwitchTransform(long row1, long row2) throws IndexOutOfBoundException;

    Matrix colSwitchTransform(long col1, long col2) throws IndexOutOfBoundException;

    Matrix rowMultiplyTransform(long row, Scalar scalar) throws IndexOutOfBoundException;

    Matrix colMultiplyTransform(long col, Scalar scalar) throws IndexOutOfBoundException;

    Matrix rowAdditionTransform(long destinationRow, long sourceRow, Scalar scalar) throws IndexOutOfBoundException; // M[destinationRow] += scalar * M[sourceRow]

    Matrix colAdditionTransform(long destinationCol, long sourceCol, Scalar scalar) throws IndexOutOfBoundException; // M[destinationCol] += scalar * M[sourceCol]

    Matrix getRREF();

    boolean isRREF();

    Scalar getDeterminant();

    Matrix getInverseMatrix() throws NonSquareMatrixException, NonInvertibleMatrixException;

}
