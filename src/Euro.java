import java.util.Objects;

class Euro {
    private int amount;

    Euro(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return amount == euro.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public Euro add(Euro euro) {
        Euro newEuro = new Euro(amount + euro.amount);
        return newEuro;
    }
}
