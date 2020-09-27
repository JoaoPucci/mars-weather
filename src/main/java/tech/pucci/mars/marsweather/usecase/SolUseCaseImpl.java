package tech.pucci.mars.marsweather.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import tech.pucci.mars.marsweather.model.Sol;

@Component
public class SolUseCaseImpl implements SolUseCase {

	@Override
	public Optional<Sol> getSolFrom(String jsonString, String key) throws JSONException {
		JSONObject json = new JSONObject(jsonString);
		if (json.has(key)) {
			JSONObject jsonSol = json.getJSONObject(key).getJSONObject("AT");
			return Optional.ofNullable(
					new Sol(key, jsonSol.getDouble("av"), jsonSol.getDouble("mn"), jsonSol.getDouble("mx")));
		}

		return Optional.ofNullable(null);
	}

	@Override
	public List<Sol> getSolsFrom(String jsonString) throws JSONException {
		JSONObject json = new JSONObject(jsonString);
		JSONArray jsonArray = json.getJSONArray("sol_keys");
		List<Sol> sols = new ArrayList<>();

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonSol = json.getJSONObject(jsonArray.getString(i)).getJSONObject("AT");
			Sol sol = new Sol(jsonArray.getString(i), jsonSol.getDouble("av"), jsonSol.getDouble("mn"),
					jsonSol.getDouble("mx"));
			sols.add(sol);
		}

		return sols;
	}

}
