package tensor;

public interface Matrix extends Cloneable {
    int CONCAT_DIRECTION_HORIZONTAL = 0;
    int CONCAT_DIRECTION_VERTICAL = 1;

    void update(int row, int col, Scalar scalar) throws IndexOutOfBoundException;

    Scalar getScalar(int row, int col) throws IndexOutOfBoundException;

    int getSizeRow();

    int getSizeCol();

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

    Vector getVectorRow(int row) throws IndexOutOfBoundException;

    Vector getVectorCol(int col) throws IndexOutOfBoundException;

    Matrix getSubMatrix(int startRow, int startCol, int endRow, int endCol) throws IndexOutOfBoundException;

    Matrix getMinorMatrix(int row, int col) throws IndexOutOfBoundException;

    Matrix getTranspose();

    Scalar getTrace();

    boolean isSquareMatrix();

    boolean isUpperTriangleMatrix();

    boolean isLowerTriangleMatrix();

    boolean isIdentityMatrix();

    boolean isZeroMatrix();

    /* 아래 6개 기능은 기본행렬 곱해서 만들면 쉽다.  */
    Matrix rowSwitchTransform(int row1, int row2) throws IndexOutOfBoundException;

    Matrix colSwitchTransform(int col1, int col2) throws IndexOutOfBoundException;

    Matrix rowMultiplyTransform(int row, Scalar scalar) throws IndexOutOfBoundException;

    Matrix colMultiplyTransform(int col, Scalar scalar) throws IndexOutOfBoundException;

    Matrix rowAdditionTransform(int destinationRow, int sourceRow, Scalar scalar) throws IndexOutOfBoundException; // M[destinationRow] += scalar * M[sourceRow]

    Matrix colAdditionTransform(int destinationCol, int sourceCol, Scalar scalar) throws IndexOutOfBoundException; // M[destinationCol] += scalar * M[sourceCol]

    Matrix getRREF();

    boolean isRREF();

    Scalar getDeterminant();

    Matrix getInverseMatrix() throws NonSquareMatrixException, NonInvertibleMatrixException;

}
