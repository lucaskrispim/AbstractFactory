import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowsTextBoxTest {

    @Test
    public void testRender() {
        WindowsTextBox windowsTextBox = new WindowsTextBox();

        // Verifica se o método render retorna a string esperada
        String expected = "Render a textbox in Windows style";
        String actual = windowsTextBox.render();

        assertEquals(expected, actual);
    }
}