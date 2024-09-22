class filterGroupDisplayComponent extends HTMLElement {
    constructor() {
        super();
        this.attachShadow({ mode: 'open' });

        const h1 = document.createElement('h1');
        h1.textContent = this.getAttribute('title') || 'Default Title';
        this.shadowRoot.append(h1);

        const slot = document.createElement('slot');
        slot.name = 'content';
        this.shadowRoot.append(slot);
    }
}

customElements.define('filter-group-display-component', filterGroupDisplayComponent);