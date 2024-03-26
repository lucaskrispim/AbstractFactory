public class Application {
    private Button button;
    private TextBox textBox;

    public Application(UIComponentFactory factory) {
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void render() {
        button.render();
        textBox.render();
    }
}
