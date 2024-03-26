public class MacOSUIComponentFactory implements UIComponentFactory {
    public Button createButton() {
        return new MacOSButton();
    }
    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
}
