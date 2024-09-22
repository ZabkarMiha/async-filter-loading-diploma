package com.example.krazowebcomponentslit.models;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@SessionScoped
public class FilterGroups implements Serializable {
    private String name;
    private List<Filter> facets;
    private String id;

    public FilterGroups(String name, List<Filter> facets, String id) {
        this.name = name;
        this.facets = facets;
        this.id = id;
    }

    public FilterGroups() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filter> getFacets() {
        return facets;
    }

    public void setFacets(List<Filter> facets) {
        this.facets = facets;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
