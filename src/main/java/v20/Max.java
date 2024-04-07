package v14;

public class Max {
    protected double value;
    protected boolean open;
    public Max(double value) {
        this.value = value;
    }

    public boolean isWithin(double maxValue) {
        return this.value > value;
    }

}