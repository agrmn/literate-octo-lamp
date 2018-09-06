package pucrs.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testGetSaudacaoOlaMundo() {
    	String expected = "Olá, mundo!";
    	String actual = App.getSaudacao();
        assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSaudacaoIniciaComO() {
    	String actual = App.getSaudacao();
        assertTrue(actual.startsWith("O"));
	}

}
