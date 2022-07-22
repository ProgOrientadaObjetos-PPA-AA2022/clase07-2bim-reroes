/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reroes
 */
public class CiudadTest {
    private Ciudad instance;
    public CiudadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Ciudad();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNombres() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("establecerNombre");
        String nom = "Loja";
        instance.establecerNombre(nom);
        Field field = instance.getClass().getDeclaredField("nombre");
        field.setAccessible(true);
        assertEquals(field.get(instance), "Loja");
    }
    
    @Test
    public void testObtenerNombres() {
        System.out.println("obtenerNombre");
        String nom = "Loja";
        instance.establecerNombre(nom);
        assertEquals(instance.obtenerNombre(), "Loja");
    }
    
    @Test
    public void testEstablecerPoblacion() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("establecerPoblacion");
        int nom = 230343;
        instance.establecerPoblacion(nom);
        Field field = instance.getClass().getDeclaredField("poblacion");
        field.setAccessible(true);
        assertEquals(field.get(instance), 230343);
    }
    
    @Test
    public void testObtenerPoblacion() {
        System.out.println("obtenerPoblacion");
        int nom = 100111;
        instance.establecerPoblacion(nom);
        assertEquals(instance.obtenerPoblacion(), 100111);
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        instance.establecerNombre("Cuenca");
        instance.establecerPoblacion(500123);
        
        String expResult = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                "Cuenca",
                500123
                );
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
