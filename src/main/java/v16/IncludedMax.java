package v14;
public class IncludedMax {

    public IncludedMax(boolean maxOpen, double max) extend Max {
        super(maxOpen, max);
    }

    public boolean greaterOrEquals(double value) {
        return this.value >= value;
    }

}