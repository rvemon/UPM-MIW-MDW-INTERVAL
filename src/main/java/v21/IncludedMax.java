package v14;
public class IncludedMax {

    public IncludedMax(double value) extend Max {
        super(value);
    }

    public boolean isOnLeft(double value) {
        return this.value >= value;
    }

}