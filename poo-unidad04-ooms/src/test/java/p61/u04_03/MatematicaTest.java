/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package p61.u04_03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author morti
 */
public class MatematicaTest {
    
    public MatematicaTest() {
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
     * Test of calcularSuma method, of class Matematica.
     */
    @Test
    public void testCalcularSuma() {
        System.out.println("calcularSuma");
        Matematica instance = new Matematica(10,20,30);
        double expResult = 60;
        double result = instance.calcularSuma();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of calcularResta method, of class Matematica.
     */
    @Test
    public void testCalcularResta() {
        System.out.println("calcularResta");
        Matematica instance = new Matematica(10,20,30);;
        double expResult = -40;
        double result = instance.calcularResta();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calcularMultiplicacion method, of class Matematica.
     */
    @Test
    public void testCalcularMultiplicacion() {
        System.out.println("calcularMultiplicacion");
        Matematica instance = null;
        double expResult = 0.0;
        double result = instance.calcularMultiplicacion();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDivision method, of class Matematica.
     */
    @Test
    public void testCalcularDivision() {
        System.out.println("calcularDivision");
        Matematica instance = null;
        double expResult = 0.0;
        double result = instance.calcularDivision();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
