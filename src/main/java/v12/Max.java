package v12;

public class Max {
    private double value;
    private boolean open;
    public Max(boolean maxOpen, int max) {
        this.value = max;
        this.open = maxOpen;
    }

    public boolean greater(double maxValue) {
        if (this.open){
            return this.value > maxValue;
        }
        return this.value >= maxValue;
    }

}