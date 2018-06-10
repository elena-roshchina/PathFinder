package example.hackathon.pathfinder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testRequest() throws Exception {
        Retrofits.flight.getData("0e29a686b2ad016b6d43087b0f441dbe","LED", "MOW", "10-06-2018", 999, 1).execute();
    }
}