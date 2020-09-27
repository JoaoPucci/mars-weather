package tech.pucci.mars.marsweather.service;

import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import tech.pucci.mars.marsweather.model.Sol;
import tech.pucci.mars.marsweather.usecase.SolUseCase;

@Service
public class NasaInsightService {

	private RestTemplate rest;
	private SolUseCase useCase;

	public NasaInsightService(RestTemplateBuilder restBuilder, SolUseCase useCase) {
		this.rest = restBuilder.build();
		this.useCase = useCase;
	}

	private String getInsightResponse() {
		return rest.getForObject("https://api.nasa.gov/insight_weather/?api_key=DEMO_KEY&feedtype=json&ver=1.0",
				String.class);
	}

	public List<Sol> getSols() throws JSONException {
		return useCase.getSolsFrom(getInsightResponse());
	}

	public Optional<Sol> getSol(String name) throws JSONException {
		return useCase.getSolFrom(getInsightResponse(), name);
	}

}
