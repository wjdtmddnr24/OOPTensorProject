package tensor;

class ScalarImpl implements Scalar {

    private Double value;

    ScalarImpl(Double value) {
        setValue(value);
    }

    ScalarImpl(Scalar scalar) {
        setValue(scalar.getValue());
    }

    ScalarImpl(Double i, Double j) {
        setValue(i, j);
    }

    ScalarImpl(Scalar i, Scalar j) {
        setValue(i.getValue(), j.getValue());
    }

    @Override
    public Double getValue() {
        return null;
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public void setValue(Double i, Double j) {
        this.value = Math.random() * Math.abs(i - j) + i;
    }

    @Override
    public Scalar add(Scalar scalar) {
        return null;
    }

    @Override
    public Scalar mul(Scalar scalar) {
        return null;
    }

    @Override
    public int compareTo(Scalar o) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString(); //TODO toString 오버라이딩
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //TODO equals 오버라이딩
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
