package v13;

public class Max {
    protected double value;
    protected boolean open;
    public Max(boolean maxOpen, int max) {
        this.value = max;
        this.open = maxOpen;
    }

    public boolean greaterOrEquals(double maxValue) {
        if (this.open){
            return this.value > maxValue;
        }
        return this.value >= maxValue;
    }

}