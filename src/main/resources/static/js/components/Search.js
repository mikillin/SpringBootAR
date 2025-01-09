class Search extends  HTMLDivElement{
    constructor() {
        super();

    }

    connectedCallback(){
        this.render();
    }


    render(){
        // const name = this.getAttribute("name");
        // const position = this.getAttribute("position");
        // <h2>${name}</h2>
        // <p>${position}</p>


        this.innerHTML = `
   <div>

             hallo here =)   
</div>        
`
    }

    static get observedAttributes() {
        return ['name']; // List of attributes to observe
    }
}

customElements.define("search", Search, {extends: "div"});

export default Search;