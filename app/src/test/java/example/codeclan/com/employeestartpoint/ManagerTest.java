package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 24/10/2017.
 */

public class ManagerTest {

    Manager manager;


    @Before
    public void before() {
        manager = new Manager(1, "Richie Rich", "2b3c4d", 500000.00, "Corporate");
    }

    @Test
    public void testManagerHasName(){
        assertEquals("Richie Rich", manager.getName());
    }

    @Test
    public void testManagerHasDeptName(){
        assertEquals("Corporate", manager.getDeptName());
    }


}
