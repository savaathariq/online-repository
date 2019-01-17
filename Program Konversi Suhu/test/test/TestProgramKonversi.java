/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import program.konversi.suhu.Frame_program_konversi_suhu;

/**
 *
 * @author ACER
 */
public class TestProgramKonversi {
    
    public TestProgramKonversi() {
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
    public void testProgram() {
        Frame_program_konversi_suhu obj = new Frame_program_konversi_suhu();
    float input = 10;
    obj.Hitung(input);
    float expected1 = 50;
    float expected2 = (float) 283.1499938964844;
    float expected3 = 8;
    assertEquals(expected1, obj.fahren, 0.0);
    assertEquals(expected2, obj.kelvin, 0.0);
    assertEquals(expected3, obj.reamur, 0.0);
    
    
    }
}
