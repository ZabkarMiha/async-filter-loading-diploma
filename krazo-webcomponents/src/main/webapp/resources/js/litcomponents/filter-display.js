import { LitElement, html } from 'lit';
import { customElement, state } from 'lit/decorators.js';

@customElement("filter-display-component-lit")
class FilterDisplayComponent extends LitElement {

    @state()
    facetGroups = [];

    @state()
    displayFacets = false;

    appContext = window.location.pathname.replace('/mvc/litcomponent', '');

    async fetchFacetGroups() {
        try {
            const response = await fetch(this.appContext + '/resources/data/facets.json');
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            const data = await response.json();
            this.facetGroups = data.value.facetGroups;
            this.displayFacets = true;
            this.requestUpdate();
        } catch (error) {
            console.error('Error fetching facet groups:', error);
        }
    }

    render() {
        return html`
            <button @click="${this.fetchFacetGroups}">Load Facet Groups</button>

            ${this.displayFacets ? html`
                ${this.facetGroups.map(group => html`
                    <div>
                        <h2>${group.name}</h2>
                        ${group.facets.map(facet => html`
                            <div>${facet.value}</div>
                        `)}
                    </div>
                `)}
            ` : ''}
        `;
    }
}