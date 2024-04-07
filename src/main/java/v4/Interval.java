package v4;

public class Interval {

	private double max;

	public Interval(double min, double max) {
		this.max = max;
	}

	public boolean include(double value) {
		return value <= this.max;
	}


}