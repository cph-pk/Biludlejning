/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejningsopgave;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Per
 */
public class BenzinbilTest {
    
    public BenzinbilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOktantal method, of class Benzinbil.
     */
    @Test
    public void testGetOktantal() {
        System.out.println("getOktantal");
        Benzinbil instance = null;
        double expResult = 0.0;
        double result = instance.getOktantal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKmPrL method, of class Benzinbil.
     */
    @Test
    public void testGetKmPrL() {
        System.out.println("getKmPrL");
        Benzinbil instance = null;
        double expResult = 0.0;
        double result = instance.getKmPrL();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOktantal method, of class Benzinbil.
     */
    @Test
    public void testSetOktantal() {
        System.out.println("setOktantal");
        int oktantal = 0;
        Benzinbil instance = null;
        instance.setOktantal(oktantal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKmPrL method, of class Benzinbil.
     */
    @Test
    public void testSetKmPrL() {
        System.out.println("setKmPrL");
        Double kmPrL = null;
        Benzinbil instance = null;
        instance.setKmPrL(kmPrL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Benzinbil.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Benzinbil instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beregnGroenEjerafgift method, of class Benzinbil.
     */
    @Test
    public void testBeregnGroenEjerafgift() {
        System.out.println("beregnGroenEjerafgift");
        Benzinbil instance = null;
        double expResult = 0.0;
        double result = instance.beregnGroenEjerafgift();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
