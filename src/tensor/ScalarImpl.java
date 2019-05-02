package tensor;

public class ScalarImpl implements Scalar {

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

    @Override
    public Double getValue() {
        return null;
    }

    @Override
    public void setValue(Double value) {

    }

    @Override
    public void setValue(Double i, Double j) {

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

    


}
