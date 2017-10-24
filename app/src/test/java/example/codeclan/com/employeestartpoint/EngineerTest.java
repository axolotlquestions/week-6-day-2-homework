package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 24/10/2017.
 */

public class EngineerTest {
    Engineer engineer;

    @Before
    public void before(){
        engineer = new Engineer(6, "Spanners McGee", "4d6e7f", 25000.00);
    }

    @Test
    public void testEngineerHasName(){
        assertEquals("Spanners McGee", engineer.getName());
    }
}
