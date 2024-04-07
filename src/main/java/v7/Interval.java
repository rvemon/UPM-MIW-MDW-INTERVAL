package v7;

public class Interval {

	private double max;
	private boolean maxOpen;

	public Interval(double min, boolean maxOpen double max) {

		this.maxOpen = maxOpen;
		this.max = max;

	}

	public boolean include(double value) {

		if (this.maxOpen){
			return  value < this.max;
		}
		return value <= this.max;
	}


}