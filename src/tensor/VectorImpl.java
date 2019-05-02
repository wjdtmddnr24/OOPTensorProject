package tensor;

import java.util.ArrayList;
import java.util.List;

class VectorImpl implements Vector {

    private List<Scalar> vector;

    VectorImpl() {
        vector = new ArrayList<>();
    }

    VectorImpl(long dimension, Double value) throws SizeLessThanZeroException {
        this();
        setVector(dimension, value);
    }

    VectorImpl(long dimension, Scalar scalar) throws SizeLessThanZeroException {
        this();
        setVector(dimension, scalar);
    }

    VectorImpl(long dimension, Double i, Double j) throws SizeLessThanZeroException {
        this();
        setVector(dimension, i, j);
    }

    VectorImpl(long dimension, Scalar i, Scalar j) throws SizeLessThanZeroException {
        this();
        setVector(dimension, i, j);
    }

    VectorImpl(Double[] arr) throws SizeLessThanZeroException {
        this();
        setVector(arr);
    }

    VectorImpl(Scalar[] arr) throws SizeLessThanZeroException {
        this();
        setVector(arr);
    }


    @Override
    public void setVector(long dimension, Double value) throws SizeLessThanZeroException {
        if (dimension < 0)
            throw new SizeLessThanZeroException();
        if (vector.size() > 0)
            vector.clear();
        for (int i = 0; i < dimension; i++) {
            vector.add(new ScalarImpl(value));
        }
    }

    @Override
    public void setVector(long dimension, Scalar scalar) throws SizeLessThanZeroException {
        if (dimension < 0)
            throw new SizeLessThanZeroException();
        if (vector.size() > 0)
            vector.clear();
        for (int i = 0; i < dimension; i++) {
            vector.add(new ScalarImpl(scalar));
        }
    }

    @Override
    public void setVector(long dimension, Double i, Double j) throws SizeLessThanZeroException {
        if (dimension < 0)
            throw new SizeLessThanZeroException();
        if (vector.size() > 0)
            vector.clear();
        for (int k = 0; k < dimension; k++) {
            vector.add(new ScalarImpl(i, j));
        }
    }

    @Override
    public void setVector(long dimension, Scalar i, Scalar j) throws SizeLessThanZeroException {
        if (dimension < 0)
            throw new SizeLessThanZeroException();
        if (vector.size() > 0)
            vector.clear();
        for (int k = 0; k < dimension; k++) {
            vector.add(new ScalarImpl(i, j));
        }
    }

    @Override
    public void setVector(Double[] arr) throws SizeLessThanZeroException {
        if (vector.size() > 0)
            vector.clear();
        for (int k = 0; k < arr.length; k++) {
            vector.add(new ScalarImpl(arr[k]));
        }

    }

    @Override
    public void setVector(Scalar[] arr) throws SizeLessThanZeroException {
        if (vector.size() > 0)
            vector.clear();
        for (int k = 0; k < arr.length; k++) {
            vector.add(new ScalarImpl(arr[k]));
        }
    }

    @Override
    public void update(long col, Scalar scalar) throws IndexOutOfBoundException {

    }

    @Override
    public Scalar getScalar(long col) throws IndexOutOfBoundException {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public Vector add(Vector vector) throws SizeMismatchException {
        return null;
    }

    @Override
    public Vector mul(Scalar scalar) {
        return null;
    }

    @Override
    public Matrix toMatrixNx1() {
        return null;
    }

    @Override
    public Matrix toMatrix1xN() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //TODO equals 오버라이딩
    }

    @Override
    public String toString() {
        return super.toString();//TODO toString 오버라이딩

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
