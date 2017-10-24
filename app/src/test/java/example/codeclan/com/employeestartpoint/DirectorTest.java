package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 24/10/2017.
 */

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(1, "Billy Bigboss", "2b3c4d", 10000000.00, "Corporate", 100000.00);
    }

    @Test
    public void testDirectorhasName(){
        assertEquals("Billy Bigboss", director.getName());
    }

    @Test
    public void testDirectorHasBudget(){
        assertEquals(100000.00, director.getBudget(), 0.1);
    }
}
