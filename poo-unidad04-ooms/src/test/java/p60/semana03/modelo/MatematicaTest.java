/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package p60.semana03.modelo;

import p60.u04_03.modelo.Matematica;
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

    @Test
    public void testCalcularMultiplicacion() {
        System.out.println("calcularMultiplicacion");
        Matematica instance = new Matematica(1,1,9);
        double expResult = 9.0;
        double result = instance.calcularMultiplicacion();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalcularDivision01() {
        System.out.println("calcularDivision con decimales");
        Matematica instance = new Matematica(80,7.999999966666661412,10);
        double expResult = 1.0;
        double result = instance.calcularDivision();
        assertEquals(expResult, result, 0.001);
    }
    @Test
    public void testCalcularDivision02() {
        System.out.println("calcularDivision con enteros");
        Matematica instance = new Matematica(80,8,10);
        double expResult = 1.0;
        double result = instance.calcularDivision();
        assertEquals(expResult, result, 0.001);
    }
    
}
