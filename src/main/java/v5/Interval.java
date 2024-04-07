package v5;

public class Interval {

	private double max;

	public Interval(double min, boolean maxOpen double max) {
		this.max = max;
	}

	public boolean include(double value) {
		return value <= this.max;
	}


}