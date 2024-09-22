package com.example.krazowebcomponentslit.controllers;

import com.example.krazowebcomponentslit.models.FilterGroups;
import com.example.krazowebcomponentslit.helpers.JsonParser;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.io.Serializable;
import java.util.List;


@SessionScoped
@Controller
@Path("/")
public class ComponentController implements Serializable {

    @Inject
    private Models models;

    private final List<FilterGroups> filterGroupsList = JsonParser.getFilters();

    public ComponentController() { }

    @Path("/")
    @GET
    public String defaultPage() {
        return "index.xhtml";
    }

    @Path("/webcomponent")
    @GET
    public String webcomponent() {
        models.put("filterGroupsList", filterGroupsList);

        return "webcomponent.xhtml";
    }

    @Path("/litcomponent")
    @GET
    public String litcomponent() {
        return "litcomponent.xhtml";
    }
}