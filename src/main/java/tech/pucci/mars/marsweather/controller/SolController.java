package tech.pucci.mars.marsweather.controller;

import java.util.List;

import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.pucci.mars.marsweather.model.SolDTO;
import tech.pucci.mars.marsweather.model.SolDetailsDTO;
import tech.pucci.mars.marsweather.service.NasaInsightService;

@RestController
@RequestMapping("/sols")
@CrossOrigin(origins = "*", maxAge = 3600)
public class SolController {
	private NasaInsightService service;

	public SolController(NasaInsightService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<SolDTO>> getSols() throws JSONException {
		return ResponseEntity.ok(SolDTO.from(service.getSols()));
	}

	@GetMapping(path = "/{name}")
	public ResponseEntity<SolDetailsDTO> getSol(@PathVariable String name) throws JSONException {
		return ResponseEntity.of(SolDetailsDTO.from(service.getSol(name)));
	}
}
