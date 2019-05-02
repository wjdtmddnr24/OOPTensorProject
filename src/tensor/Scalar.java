package tensor;

public interface Scalar extends Comparable<Scalar>, Cloneable {
    Double getValue();

    void setValue(Double value);

    void setValue(Double i, Double j);

    Scalar add(Scalar scalar);

    Scalar mul(Scalar scalar);

    static Scalar add(Scalar a, Scalar b) {
        return null;
    }

    static Scalar mul(Scalar a, Scalar b) {
        return null;
    }


}
