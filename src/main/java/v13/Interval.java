package v13;

public class Interval {

	private Max max;

	public Interval(double min, Max max) {


		this.max = max;

	}

	public boolean include(double value) {

		return this.max.greaterOrEquals(value);
	}


}