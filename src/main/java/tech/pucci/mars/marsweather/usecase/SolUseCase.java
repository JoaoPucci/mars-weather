package tech.pucci.mars.marsweather.usecase;

import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.springframework.stereotype.Component;

import tech.pucci.mars.marsweather.model.Sol;

@Component
public interface SolUseCase {
	
	public abstract Optional<Sol> getSolFrom(String jsonString, String key) throws JSONException;
	public abstract List<Sol> getSolsFrom(String jsonString) throws JSONException;
	
}
