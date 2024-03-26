import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MacOSButtonTest {

    @Test
    public void testRender() {
        MacOSButton macOSButton = new MacOSButton();


        String expected = "Render a button in MacOS style";
        String actual = macOSButton.render();

        assertEquals(expected, actual);
    }
}