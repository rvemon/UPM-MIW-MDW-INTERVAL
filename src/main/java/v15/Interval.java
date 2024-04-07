package v14;

public class Interval {

	private Max max;

	public Interval(Max max) {


		this.max = max;

	}

	public boolean include(double value) {

		return this.max.greaterOrEquals(value);
	}


}