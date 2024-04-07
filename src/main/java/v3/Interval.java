package v3;

public class Interval {

	private double max;

	public Interval(double d, double e) {
		this.max = e;
	}

	public boolean include(double d) {
		return d <= this.max;
	}


}