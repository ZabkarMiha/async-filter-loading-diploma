export interface Root {
    error: null | string; // Assuming it can be null or a string
    value: Value;
    status: string;
}

interface Value {
    query: Query;
    error: null | string;
    facetGroups: FacetGroup[];
}

interface Query {
    command: string;
    maxHits: number;
    sortField: null | string;
    materialType: string;
    searchFacets: null | string;
    personalRelevance: number;
    start: number;
    databases: string[];
    depAcronyms: null | string;
    publicationYearStart: null | number;
    publicationYearEnd: null | number;
    discoveryAuthenticated: boolean;
    openAccess: boolean;
    publicationDateRange: null | string;
    publicationDateStart: null | string;
    publicationDateEnd: null | string;
    dateModifiedRange: null | string;
    discoveryHoldingsOnly: boolean;
    facets: boolean;
    discoverySearch: boolean;
    pageNumber: number;
}

interface FacetGroup {
    name: string;
    facets: Facet[];
    id: string;
}

interface Facet {
    text: string;
    value: string;
    id: string;
    frequency: number;
}