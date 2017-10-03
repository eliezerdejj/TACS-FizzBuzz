/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliez
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
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
     * Test of fizzbuzz method, of class FizzBuzz.
     */
    @Test
    public void testFizzbuzz() {
        System.out.println("TESTE 1");
        int a = 2;
        int b = 2;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFizzbuzz2() {
        System.out.println("TESTE 2");
        int a = 3;
        int b = 4;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFizzbuzz3() {
        System.out.println("TESTE 3");
        int a = 5;
        int b = 15;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFizzbuzz4() {
        System.out.println("TESTE 4");
        int a = 25;
        int b = 6;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
    @Test
    public void testFizzbuzz5() {
        System.out.println("TESTE 5");
        int a = 8;
        int b = 5;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFizzbuzz6() {
        System.out.println("TESTE 6");
        int a = 15;
        int b = 5;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testFizzbuzz7() {
        System.out.println("TESTE 3");
        int a = 15;
        int b = 15;
        FizzBuzz instance = new FizzBuzz();
        instance.fizzbuzz(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
