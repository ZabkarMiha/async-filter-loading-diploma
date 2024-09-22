package com.example.krazowebcomponentslit.models;


import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Query implements Serializable {
    private String command;
    private int maxHits;
    private String sortField;
    private String materialType;
    private String searchFacets;
    private int personalRelevance;
    private int start;
    private String[] databases;
    private String depAcronyms;
    private String publicationYearStart;
    private String publicationYearEnd;
    private boolean discoveryAuthenticated;
    private boolean openAccess;
    private String publicationDateRange;
    private String publicationDateStart;
    private String publicationDateEnd;
    private String dateModifiedRange;
    private boolean discoveryHoldingsOnly;
    private boolean facets;
    private boolean discoverySearch;
    private int pageNumber;

    public Query(String command, int maxHits, String sortField, String materialType, String searchFacets, int personalRelevance, int start, String[] databases, String depAcronyms, String publicationYearStart, String publicationYearEnd, boolean discoveryAuthenticated, boolean openAccess, String publicationDateRange, String publicationDateStart, String publicationDateEnd, String dateModifiedRange, boolean discoveryHoldingsOnly, boolean facets, boolean discoverySearch, int pageNumber) {
        this.command = command;
        this.maxHits = maxHits;
        this.sortField = sortField;
        this.materialType = materialType;
        this.searchFacets = searchFacets;
        this.personalRelevance = personalRelevance;
        this.start = start;
        this.databases = databases;
        this.depAcronyms = depAcronyms;
        this.publicationYearStart = publicationYearStart;
        this.publicationYearEnd = publicationYearEnd;
        this.discoveryAuthenticated = discoveryAuthenticated;
        this.openAccess = openAccess;
        this.publicationDateRange = publicationDateRange;
        this.publicationDateStart = publicationDateStart;
        this.publicationDateEnd = publicationDateEnd;
        this.dateModifiedRange = dateModifiedRange;
        this.discoveryHoldingsOnly = discoveryHoldingsOnly;
        this.facets = facets;
        this.discoverySearch = discoverySearch;
        this.pageNumber = pageNumber;
    }

    public Query() {
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(int maxHits) {
        this.maxHits = maxHits;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getSearchFacets() {
        return searchFacets;
    }

    public void setSearchFacets(String searchFacets) {
        this.searchFacets = searchFacets;
    }

    public int getPersonalRelevance() {
        return personalRelevance;
    }

    public void setPersonalRelevance(int personalRelevance) {
        this.personalRelevance = personalRelevance;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String[] getDatabases() {
        return databases;
    }

    public void setDatabases(String[] databases) {
        this.databases = databases;
    }

    public String getDepAcronyms() {
        return depAcronyms;
    }

    public void setDepAcronyms(String depAcronyms) {
        this.depAcronyms = depAcronyms;
    }

    public String getPublicationYearStart() {
        return publicationYearStart;
    }

    public void setPublicationYearStart(String publicationYearStart) {
        this.publicationYearStart = publicationYearStart;
    }

    public String getPublicationYearEnd() {
        return publicationYearEnd;
    }

    public void setPublicationYearEnd(String publicationYearEnd) {
        this.publicationYearEnd = publicationYearEnd;
    }

    public boolean isDiscoveryAuthenticated() {
        return discoveryAuthenticated;
    }

    public void setDiscoveryAuthenticated(boolean discoveryAuthenticated) {
        this.discoveryAuthenticated = discoveryAuthenticated;
    }

    public boolean isOpenAccess() {
        return openAccess;
    }

    public void setOpenAccess(boolean openAccess) {
        this.openAccess = openAccess;
    }

    public String getPublicationDateRange() {
        return publicationDateRange;
    }

    public void setPublicationDateRange(String publicationDateRange) {
        this.publicationDateRange = publicationDateRange;
    }

    public String getPublicationDateStart() {
        return publicationDateStart;
    }

    public void setPublicationDateStart(String publicationDateStart) {
        this.publicationDateStart = publicationDateStart;
    }

    public String getPublicationDateEnd() {
        return publicationDateEnd;
    }

    public void setPublicationDateEnd(String publicationDateEnd) {
        this.publicationDateEnd = publicationDateEnd;
    }

    public String getDateModifiedRange() {
        return dateModifiedRange;
    }

    public void setDateModifiedRange(String dateModifiedRange) {
        this.dateModifiedRange = dateModifiedRange;
    }

    public boolean isDiscoveryHoldingsOnly() {
        return discoveryHoldingsOnly;
    }

    public void setDiscoveryHoldingsOnly(boolean discoveryHoldingsOnly) {
        this.discoveryHoldingsOnly = discoveryHoldingsOnly;
    }

    public boolean isFacets() {
        return facets;
    }

    public void setFacets(boolean facets) {
        this.facets = facets;
    }

    public boolean isDiscoverySearch() {
        return discoverySearch;
    }

    public void setDiscoverySearch(boolean discoverySearch) {
        this.discoverySearch = discoverySearch;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
