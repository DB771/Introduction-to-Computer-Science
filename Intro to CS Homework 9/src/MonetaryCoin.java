public class MonetaryCoin extends Coin {
    private int valueInCents;

    public MonetaryCoin(int valueInCents) {
        this.valueInCents = valueInCents;
    }

    public int getValue() {
        return valueInCents;
    }

    public void setValue(int valueInCents) {
        if (valueInCents >= 1 && valueInCents <= 100) {
            this.valueInCents = valueInCents;
        }
        else {
            System.out.println("Invalid. Value must be between 1 and 100, inclusive.");
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " - " + valueInCents + " cents";
    }
}