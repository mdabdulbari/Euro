class Euro {
    private int amount;

    Euro(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Euro euro = (Euro) o;
        return this.amount == euro.amount;
    }
}
