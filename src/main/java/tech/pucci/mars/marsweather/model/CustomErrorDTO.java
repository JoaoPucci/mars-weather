package tech.pucci.mars.marsweather.model;

public class CustomErrorDTO {
	
	private String message;
	
	public CustomErrorDTO(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
