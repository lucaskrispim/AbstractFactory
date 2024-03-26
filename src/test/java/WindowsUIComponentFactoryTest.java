import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class WindowsUIComponentFactoryTest {

    @Test
    public void testCreateButton() {
        WindowsUIComponentFactory factory = new WindowsUIComponentFactory();
        Button button = factory.createButton();

        assertTrue(button instanceof WindowsButton);
    }

    @Test
    public void testCreateTextBox() {
        WindowsUIComponentFactory factory = new WindowsUIComponentFactory();
        TextBox textBox = factory.createTextBox();

        assertTrue(textBox instanceof WindowsTextBox);
    }
}