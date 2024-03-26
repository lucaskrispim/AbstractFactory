public class WindowsUIComponentFactory implements UIComponentFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
