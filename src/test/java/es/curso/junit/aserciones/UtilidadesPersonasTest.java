package es.curso.junit.aserciones;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class UtilidadesPersonasTest {

    private UtilidadesPersonas utils;

    @Before
    public void setUp() throws Exception {
        utils = new UtilidadesPersonas();
    }

    @Test
    public void testGetCarlos() throws  Exception{
//        Persona personaCarlos = new Persona("Carlos","Romero");
//        Assert.assertEquals("Carlos",personaCarlos.getNombre());
        //given
        //when
        Persona carlos = utils.getCarlos();
        //then
        assertEquals("Carlos",carlos.getNombre());
        assertEquals("Romero",carlos.getApellido());
    }

    @Test
    public void testGetJuan() {
        //given
        //when
        Persona juan = utils.getJuan();
        //then
        assertEquals("Juan",juan.getNombre());
        assertEquals("Lopez",juan.getApellido());

    }

    @Test
    public void testPersonasDiferentes(){
        //when
        Persona carlos = utils.getCarlos();
        Persona juan   = utils.getJuan();
        //then
        assertNotEquals(carlos,juan);

    }

}