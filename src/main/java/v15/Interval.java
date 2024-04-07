package v14;

public class Interval {

	private Max max;

	public Interval(Max max) {


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