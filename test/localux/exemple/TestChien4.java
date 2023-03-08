package localux.exemple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

// testExemple avec JUnit4 !!! dépendance : Hamcrest (Standard)
public class TestChien4 {

    @Test
    public void demoTestMethode() {
        assertTrue(true);
    }

    @Test
    public void testAboiement1() {
        String expectedString = "Wouaf";
        assertEquals(expectedString, "Wouaf");
        System.out.println("TEST1 : Wouaf Wouaf passé ... c'est un chien");
    }

    @Test
    public void testAboiement2() {
        String expectedString = "Wouaf";
            assertEquals(expectedString, "Miaou");
            System.out.println("TEST2 : Wouaf Miaou passé ... c'est un chien");

    }
}
