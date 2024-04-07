package v14;
public class IncludedMax {

    public IncludedMax(int i, boolean b) extend Max {
        super(i,b);
    }

    public boolean greaterOrEquals(double value) {
        return this.value >= value;
    }

}