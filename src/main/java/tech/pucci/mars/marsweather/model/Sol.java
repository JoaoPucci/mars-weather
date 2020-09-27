package tech.pucci.mars.marsweather.model;

public class Sol {
	
	private String name;
	private double average;
	private double minimum;
	private double maximum;
	
	public Sol(String name, double average, double minimum, double maximum) {
		this.name = name;
		this.average = average;
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public String getName() {
		return name;
	}

	public double getAverage() {
		return average;
	}

	public double getMinimum() {
		return minimum;
	}

	public double getMaximum() {
		return maximum;
	}

}
