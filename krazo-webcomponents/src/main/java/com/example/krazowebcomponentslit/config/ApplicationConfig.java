package com.example.krazowebcomponentslit.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/mvc")  // Defines the base path for all MVC requests
public class ApplicationConfig extends Application {
    // No additional configuration is required here.
}
