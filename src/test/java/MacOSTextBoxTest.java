import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MacOSTextBoxTest {

    @Test
    public void testRender() {
        MacOSTextBox macOSTextBox = new MacOSTextBox();


        String expected = "Render a textbox in MacOS style";
        String actual = macOSTextBox.render();

        assertEquals(expected, actual);
    }
}