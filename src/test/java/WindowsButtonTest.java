import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class WindowsButtonTest {

    @Test
    public void testRender() {
        WindowsButton windowsButton = new WindowsButton();

        String expected = "Render a button in Windows style";
        String actual = windowsButton.render();

        assertEquals(expected, actual);
    }
}