
class chatgptDIV extends HTMLDivElement {
    constructor() {
        super();
        this.style.border = '2px solid blue';
        this.style.padding = '10px';
        this.style.display = 'block';
        this.innerText = 'Hello from MyCustomDiv!';
    }

    connectedCallback() {
        this.render();
    }

    attributeChangedCallback(name, oldValue, newValue) {
        if (oldValue !== newValue) {
            this.render(); // Re-render on attribute change
        }
    }



    render() {
        const name = this.getAttribute("name") || "Default Name";
        const position = this.getAttribute("position") || "Default Position";

        this.innerHTML = `
      <div>
        <h2>${name}</h2>
        <p>${position}</p>
        <p>Hallo here =)</p>
      </div>
    `;
    }

    static get observedAttributes() {
        return ["name", "position"]; // List of attributes to observe
    }
}
customElements.define("chatgpt", chatgptDIV, { extends: "div" });
export default chatgpt;

