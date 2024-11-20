package es.curso.junit.aserciones;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilidadesTest {

    private Utilidades utils;

    @Before
    public void setUp() throws Exception{
        utils = new Utilidades();
    }

    @Test
    public void testGetArrayStrings() {
        //given
        String [] esperado = {"uno","dos","tres"};
        //when
        String [] resultado = utils.getArrayStrings("uno","dos","tres");
        //then
        assertArrayEquals(esperado,resultado);
        assertEquals(3,resultado.length);
        assertEquals(esperado.length,resultado.length);

        //Los elementos son iguales uno a uno
        assertEquals(esperado[0],resultado[0]);
        assertEquals(esperado[1],resultado[1]);
        assertEquals(esperado[2],resultado[2]);

        //Not equals
        assertNotEquals(esperado[0],resultado[1]);
        assertNotEquals(esperado[0],resultado[2]);

        
    }
}