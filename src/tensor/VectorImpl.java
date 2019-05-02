package tensor;

class VectorImpl implements Vector {
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

    @Override
    public void setVector(long dimension, Double value) {

    }

    @Override
    public void setVector(long dimension, Scalar scalar) {

    }

    @Override
    public void setVector(long dimension, Double i, Double j) {

    }

    @Override
    public void setVector(long dimension, Scalar i, Scalar j) {

    }

    @Override
    public void setVector(Double[] arr) {

    }

    @Override
    public void setVector(Scalar[] arr) {

    }

    @Override
    public void update(long col, Scalar scalar) {

    }

    @Override
    public Scalar getScalar(long col) {
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
}
