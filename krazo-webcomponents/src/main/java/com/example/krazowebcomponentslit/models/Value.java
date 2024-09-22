package com.example.krazowebcomponentslit.models;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@SessionScoped
public class Value implements Serializable {
    private Query query;
    private String error;
    private List<FilterGroups> facetGroups;

    public Value(Query query, String error, List<FilterGroups> facetGroups) {
        this.query = query;
        this.error = error;
        this.facetGroups = facetGroups;
    }

    public Value() {
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<FilterGroups> getFacetGroups() {
        return facetGroups;
    }

    public void setFacetGroups(List<FilterGroups> facetGroups) {
        this.facetGroups = facetGroups;
    }
}
