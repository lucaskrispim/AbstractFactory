import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class MacOSUIComponentFactoryTest {

    @Test
    public void testCreateButton() {
        MacOSUIComponentFactory factory = new MacOSUIComponentFactory();
        Button button = factory.createButton();


        assertTrue(button instanceof MacOSButton);
    }

    @Test
    public void testCreateTextBox() {
        MacOSUIComponentFactory factory = new MacOSUIComponentFactory();
        TextBox textBox = factory.createTextBox();

        assertTrue(textBox instanceof MacOSTextBox);
    }
}