package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_includes_euros_exchange_and_usd() {
        App myApp = new App();
        int eu = 81;
        double exR = 1.3751;
        final double usd = Math.round(eu * exR);
        String expectedOutput = "81 euros at an exchange rate of 1.3751 is\n" +
                "111.38 U.S. dollars.";
        String actualOutput = myApp.generateOutputString(eu, exR, usd);

        assertEquals(expectedOutput, actualOutput);
    }
}