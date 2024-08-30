/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.trabalhoteste01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author faart
 */
public class TrabalhoTeste01Test {
    TrabalhoTeste01 tt1;
    
    public TrabalhoTeste01Test() {
        tt1 = new TrabalhoTeste01();
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
     * Test of getNum method, of class TrabalhoTeste01.
     */
    @Test
    public void testGetNum() {
        System.out.println("array num = "+Arrays.toString(tt1.getNum()));
        int[] expResult = {1,2,3,4,5};
        System.out.println("array expResult = "+Arrays.toString(expResult));
        assertArrayEquals(expResult, tt1.getNum());
    }
    
    @Test
    public void arrayItTesteTestIterable() {
        System.out.println("arrayTeste = "+tt1.getArrayItTeste().toString());
        Iterable<String> listTeste = new LinkedList<>(asList("Maria", "Ana", "Carla"));
        System.out.println("listTeste = "+listTeste.toString());
        assertIterableEquals(listTeste,tt1.getArrayItTeste());
    }
    
    @Test
    public void arrayItTesteLinesMatch() {
        List<String> nomeTest = Arrays.asList(tt1.getNome());
        List<String> expResult = Arrays.asList("\nJoao","Maria","Jose","Ana");
        System.out.println("list nomeTest = "+nomeTest.toString());
        System.out.println("resultado esperado = "+expResult.toString());
        
        assertLinesMatch(expResult, nomeTest);
    }
    
        
    @Test
    public void addArrTest() {

        assertTimeout(Duration.ofMillis(50),()->{
            tt1.addArr(100000);
            System.out.println(tt1.getIntArr().indexOf(tt1.getIntArr().size()));
        });
    }
    
    @Test
    public void arrayNullTeste(){
        assertNull(tt1.getVazio());
    }
    
    @Test
    public void numIndexTest() {
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> tt1.numIndex(10));
    }
}
