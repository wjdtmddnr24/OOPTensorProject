package tensor;

public interface Vector extends Cloneable {

    void setVector(Double[] arr) throws SizeLessThanZeroException;

    void setVector(Scalar[] arr) throws SizeLessThanZeroException;

    void update(int col, Scalar scalar) throws IndexOutOfBoundException;

    Scalar getScalar(int col) throws IndexOutOfBoundException;

    int getSize();

    Vector add(Vector vector) throws SizeMismatchException;

    Vector mul(Scalar scalar);

    static Vector add(Vector a, Vector b) throws SizeMismatchException {
        return null;
    }

    static Vector mul(Vector vector, Scalar scalar) {
        return null;
    }

    Matrix toMatrixNx1();

    Matrix toMatrix1xN();

}
