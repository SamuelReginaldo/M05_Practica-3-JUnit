/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Samuel Reginaldo
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix1() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "odnuM aloH";
        String result = MyUtils.inverteix(cadena);
        assertFalse(!expResult.equals(result), result);
        assertTrue(expResult.equals(result), result);
        
    }
    @Test
    public void testInverteix2() {
        System.out.println("inverteix");
        String cadena = null;
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat1() {
        System.out.println("edat");
        int day = 9;
        int month = 7;
        int year = 2004;
        int expResult = 18;
        int result = MyUtils.edat(day, month, year);
        System.out.println(result);
        assertEquals(expResult, result);

    }
    @Test
    public void testEdat2() {
        System.out.println("edat");
        int day = 1;
        int month = 1;
        int year = 1872;
        int expResult = -1;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testEdat3() {
        System.out.println("edat");
        int day = 26;
        int month = 4;
        int year = 2023;
        int expResult = -2;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial1() {
        System.out.println("factorial");
        double numero = 5.0;
        double expResult = 120.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        
    }
    @Test
    public void testFactorial2() {
        System.out.println("factorial");
        double numero = -2.0;
        double expResult = -1.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        
    }
    
}
