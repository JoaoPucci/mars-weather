package tech.pucci.mars.marsweather.model;

import java.util.Optional;

public class SolDetailsDTO {
	
	private String name;
	private double average;
	private double minimum;
	private double maximum;

	public SolDetailsDTO(Sol sol) {
		this.name = sol.getName();
		this.average = sol.getAverage();
		this.minimum = sol.getMinimum();
		this.maximum = sol.getMaximum();
	}
	
	public static Optional<SolDetailsDTO> from(Optional<Sol> sol) {
		if(!sol.isPresent()) {
			return Optional.ofNullable(null);
		} else {
			return Optional.ofNullable(new SolDetailsDTO(sol.get()));	
		}
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
