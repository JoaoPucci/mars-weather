package tech.pucci.mars.marsweather.model;

import java.util.List;
import java.util.stream.Collectors;

public class SolDTO {
	
	private String name;
	private double average;

	public SolDTO(Sol sol) {
		this.name = sol.getName();
		this.average = sol.getAverage();
	}

	public static List<SolDTO> from(List<Sol> sols) {
		return sols.stream().map(SolDTO::new).collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public double getAverage() {
		return average;
	}
}
