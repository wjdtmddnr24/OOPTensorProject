package tensor;

public interface Vector extends Cloneable {
    void setVector(long dimension, Double value) throws SizeLessThanZeroException;

    void setVector(long dimension, Scalar scalar) throws SizeLessThanZeroException;

    void setVector(long dimension, Double i, Double j) throws SizeLessThanZeroException;

    void setVector(long dimension, Scalar i, Scalar j) throws SizeLessThanZeroException;

    void setVector(Double[] arr) throws SizeLessThanZeroException;

    void setVector(Scalar[] arr) throws SizeLessThanZeroException;

    void update(long col, Scalar scalar) throws IndexOutOfBoundException;

    Scalar getScalar(long col) throws IndexOutOfBoundException;

    long getSize();

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
