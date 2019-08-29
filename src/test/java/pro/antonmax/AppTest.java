package pro.antonmax;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static App app;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @BeforeAll
    static void setUp()
    {
        app = new App();
    }

    @Test
    void giveNothing__whenHelloMethod__thenProperString()
    {
        String hello = app.helloMethod();

        assertEquals("Hi there!", hello);
    }
}
