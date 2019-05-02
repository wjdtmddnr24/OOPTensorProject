package tensor;

import java.util.ArrayList;
import java.util.List;

class MatrixImpl implements Matrix {

    private List<List<Scalar>> matrix;
    private long row, col;


    MatrixImpl() throws SizeMismatchException {
        matrix = new ArrayList<>();
        row = 0;
        col = 0;
    }

    MatrixImpl(long row, long col, Double value) throws SizeMismatchException {
        this();
        setMatrix(row, col, value);
    }

    MatrixImpl(long row, long col, Scalar scalar) throws SizeMismatchException {
        this();
        setMatrix(row, col, scalar);
    }

    MatrixImpl(long row, long col, Double i, Double j) throws SizeMismatchException {
        this();
        setMatrix(row, col, i, j);
    }

    MatrixImpl(long row, long col, Scalar i, Scalar j) throws SizeMismatchException {
        this();
        setMatrix(row, col, i, j);
    }

    MatrixImpl(String csv) throws SizeMismatchException, WrongCSVFormatException {
        this();
        setMatrix(csv);
    }

    MatrixImpl(Double[][] arr) throws SizeLessThanZeroException {
        this();
        setMatrix(arr);
    }

    MatrixImpl(Scalar[][] arr) throws SizeLessThanZeroException {
        this();
        setMatrix(arr);
    }

    MatrixImpl(long n) throws SizeLessThanZeroException {
        this();
        setMatrix(n);
    }

    @Override
    public void setMatrix(long row, long col, Double value) throws SizeLessThanZeroException {
        if (row < 0 || col < 0) throw new SizeLessThanZeroException();
        if (matrix.size() > 0) matrix.clear();
        for (int i = 0; i < row; i++) {
            List<Scalar> l = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                l.add(new ScalarImpl(value));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;

    }

    @Override
    public void setMatrix(long row, long col, Scalar scalar) throws SizeLessThanZeroException {
        if (row < 0 || col < 0) throw new SizeLessThanZeroException();
        if (matrix.size() > 0) matrix.clear();
        for (int i = 0; i < row; i++) {
            List<Scalar> l = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                l.add(new ScalarImpl(scalar));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;
    }

    @Override
    public void setMatrix(long row, long col, Double i, Double j) throws SizeLessThanZeroException {
        if (row < 0 || col < 0) throw new SizeLessThanZeroException();
        if (matrix.size() > 0) matrix.clear();
        for (int r = 0; r < row; r++) {
            List<Scalar> l = new ArrayList<>();
            for (int c = 0; c < col; c++) {
                l.add(new ScalarImpl(i, j));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;
    }

    @Override
    public void setMatrix(long row, long col, Scalar i, Scalar j) throws SizeLessThanZeroException {
        if (row < 0 || col < 0) throw new SizeLessThanZeroException();
        if (matrix.size() > 0) matrix.clear();
        for (int r = 0; r < row; r++) {
            List<Scalar> l = new ArrayList<>();
            for (int c = 0; c < col; c++) {
                l.add(new ScalarImpl(i, j));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;
    }

    @Override
    public void setMatrix(String csv) throws SizeLessThanZeroException, WrongCSVFormatException {
        //TODO CSV설정
    }

    @Override
    public void setMatrix(Double[][] arr) throws SizeLessThanZeroException {
        if (matrix.size() > 0) matrix.clear();
        for (int r = 0; r < row; r++) {
            List<Scalar> l = new ArrayList<>();
            for (int c = 0; c < col; c++) {
                l.add(new ScalarImpl(arr[r][c]));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;
    }

    @Override
    public void setMatrix(Scalar[][] arr) throws SizeLessThanZeroException {
        if (matrix.size() > 0) matrix.clear();
        for (int r = 0; r < row; r++) {
            List<Scalar> l = new ArrayList<>();
            for (int c = 0; c < col; c++) {
                l.add(new ScalarImpl(arr[r][c]));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;
    }

    @Override
    public void setMatrix(long n) throws SizeLessThanZeroException {
        if (n < 0) throw new SizeLessThanZeroException();
        if (matrix.size() > 0) matrix.clear();
        for (int r = 0; r < row; r++) {
            List<Scalar> l = new ArrayList<>();
            for (int c = 0; c < col; c++) {
                l.add(new ScalarImpl(r == c ? 1.0 : 0.0));
            }
            matrix.add(l);
        }
        this.row = matrix.size();
        this.col = this.row > 0 ? matrix.get(0).size() : 0;
    }

    @Override
    public void update(long row, long col, Scalar scalar) throws IndexOutOfBoundException {

    }

    @Override
    public Scalar getScalar(long row, long col) throws IndexOutOfBoundException {
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
}
