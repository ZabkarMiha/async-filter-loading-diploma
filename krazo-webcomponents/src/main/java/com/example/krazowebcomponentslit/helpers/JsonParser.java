package com.example.krazowebcomponentslit.helpers;

import com.example.krazowebcomponentslit.models.FilterGroups;
import com.example.krazowebcomponentslit.models.Response;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class JsonParser {

    public static List<FilterGroups> getFilters() {
        InputStream inputStream = JsonParser.class.getClassLoader().getResourceAsStream("static/data/facets.json");

        if (inputStream != null) {
            JsonReader reader = Json.createReader(new InputStreamReader(inputStream));

            JsonObject jsonObject = reader.readObject();
            Response response;
            try (Jsonb jsonb = JsonbBuilder.create()) {
                response = jsonb.fromJson(jsonObject.toString(), Response.class);

                return response.getValue().getFacetGroups();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("facets.json not found in classpath");
        }
    }
}
