package rats.spike;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static rats.spike.SimpleMain.parse;

public class SimpleMainTest {

    @Test
    public void testParse() throws Exception {
        assertEquals("93-5+", parse("9-3+5"));
    }
}
