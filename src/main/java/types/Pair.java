package types;

public record Pair(String key, Value value) implements Value {

    @Override
    public String type() {
        return "Pair";
    }

    @Override
    public boolean applyOperator(Operator operator, Value other) throws RuntimeException {
        throw new UnsupportedOperationException("applyOperator is not supported for Pair objects.");
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
