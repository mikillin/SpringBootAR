export default {
    data(){
        return {
            show: false,
        }
    },
    methods: {  
        changeVisibility(){
        console.log("changeVisibility");
            this.show = !this.show;
        }
    },
    template: `<h1>Type Something in the Text Field</h1>
        <label for = "inputField" > Your Text:</label>
        <input type="text" id="inputField" @input="changeVisibility" placeholder="Type here...">

            <div class="overlay" id="overlay" v-if="show"></div>
            <div class="popup" id="popup" v-if="show">
                <h3>Choose an Option</h3>
                <button id="id1" onclick="selectOption('1')">Option 1</button>
                <button id="id2" onclick="selectOption('2')">Option 2</button>
                <button onclick="closePopup()">Cancel</button>
            </div>
    `,
}