class filterDisplayComponent extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({ mode: 'open' });

        const paragraph = document.createElement('p');
        paragraph.innerText = this.getAttribute('title') || 'Default Title';
        this.shadowRoot.append(paragraph);
    }
}

customElements.define('filter-display-component', filterDisplayComponent);