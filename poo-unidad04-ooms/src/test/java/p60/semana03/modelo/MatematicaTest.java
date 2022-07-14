/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package p60.semana03.modelo;

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

    @Test
    public void testCalcularSuma() {
        System.out.println("calcularSuma");
        Matematica instance = new Matematica(10,20,30);
        double expResult = 60.0;
        double result = instance.calcularSuma();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalcularResta() {
        System.out.println("calcularResta");
        Matematica instance = new Matematica(50,30,5);
        double expResult = 15;
        double result = instance.calcularResta();
        assertEquals(expResult, result, 0.0);
    }
    
}
