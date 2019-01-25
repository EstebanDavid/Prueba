/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunitaria;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Steve
 */
public class OperacionesNGTest {
    
    public OperacionesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        float n = 2.0F;
        float n2 = 2.0F;
        Operaciones instance = new Operaciones();
        float expResult = 4.0F;
        float result = instance.Suma(n, n2);
        assertEquals(result, expResult, 8.0);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        float n = 0.0F;
        float n2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Resta(n, n2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        float n = 0.0F;
        float n2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Multiplicacion(n, n2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        float n = 0.0F;
        float n2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Division(n, n2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
