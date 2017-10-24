package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 24/10/2017.
 */

public class AdminTest {

        Admin admin;

        @Before
        public void before(){
            admin = new Admin(7, "Johnny Typeson", "6e7f8g", 15000.00);
        }

        @Test
        public void testAdminHasName(){
            assertEquals("Johnny Typeson", admin.getName());
        }


}
