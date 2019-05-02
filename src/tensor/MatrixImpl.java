package tensor;

public class MatrixImpl implements Matrix {
    @Override
    public String toString() {
        return super.toString(); //TODO toString 오버라이딩
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);//TODO equals 오버라이딩
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void setMatrix(long row, long col, Double value) {

    }

    @Override
    public void setMatrix(long row, long col, Scalar scalar) {

    }

    @Override
    public void setMatrix(long row, long col, Double i, Double j) {

    }

    @Override
    public void setMatrix(long row, long col, Scalar i, Scalar j) {

    }

    @Override
    public void setMatrix(String csv) {

    }

    @Override
    public void setMatrix(Double[][] arr) {

    }

    @Override
    public void setMatrix(Scalar[][] arr) {

    }

    @Override
    public void setMatrix(long n) {

    }

    @Override
    public void update(long row, long col, Scalar scalar) {

    }

    @Override
    public Scalar getScalar(long row, long col) {
        return null;
    }

    @Override
    public long getSizeRow() {
        return 0;
    }

    @Override
    public long getSizeCol() {
        return 0;
    }

    @Override
    public Matrix add(Matrix matrix) throws SizeMismatchException {
        return null;
    }

    @Override
    public Matrix mul(Matrix matrix, boolean isOperand) throws SizeMismatchException {
        return null;
    }

    @Override
    public Vector getVectorRow(long row) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Vector getVectorCol(long col) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix getSubMatrix(long startRow, long startCol, long endRow, long endCol) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix getMinorMatrix(long row, long col) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix getTranspose() {
        return null;
    }

    @Override
    public Scalar getTrace() {
        return null;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public boolean isUpperTriangleMatrix() {
        return false;
    }

    @Override
    public boolean isLowerTriangleMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isZeroMatrix() {
        return false;
    }

    @Override
    public Matrix rowSwitchTransform(long row1, long row2) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix colSwitchTransform(long col1, long col2) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix rowMultiplyTransform(long row, Scalar scalar) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix colMultiplyTransform(long col, Scalar scalar) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix rowAdditionTransform(long destinationRow, long sourceRow, Scalar scalar) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix colAdditionTransform(long destinationCol, long sourceCol, Scalar scalar) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public Matrix getRREF() {
        return null;
    }

    @Override
    public boolean isRREF() {
        return false;
    }

    @Override
    public Scalar getDeterminant() {
        return null;
    }

    @Override
    public Matrix getInverseMatrix() throws NonSquareMatrixException, NonInvertibleMatrixException {
        return null;
    }
}
