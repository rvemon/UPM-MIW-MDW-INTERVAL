package v14;
public class IncludedMax {

    public IncludedMax(int value) extend Max {
        super(value);
    }

    public boolean isOnLeft(double value) {
        return this.value >= value;
    }

}