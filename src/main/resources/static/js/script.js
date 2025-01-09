import {createApp} from "https://cdn.jsdelivr.net/npm/vue@3/dist/vue.esm-browser.js"
// import Search from "./components/Search.js";
import chatgpt from "./components/chatgpt.js";

const HelloWorld = {
    data() {
        return {
            text: "User",
            ul_tooltip: "tooltip",
            arr: [{"name": "name1", "value": "1"}
                , {"name": "name2", "value": "2"}
                , {"name": "name3", "value": "3"}
            ],
        };
    },
    methods: {
        changeText(event) {
            this.text = event.target.value;
        }
    }
};

createApp(HelloWorld
    ,    {
        components: {
            chatgpt
        }
    }
    ).mount("#app");

// customElements.define("search", Search, {extends: "div"});