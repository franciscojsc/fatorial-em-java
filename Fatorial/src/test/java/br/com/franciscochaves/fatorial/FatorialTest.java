package br.com.franciscochaves.fatorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FatorialTest {

	private Fatorial fatorial;

	@Before
	public void inicializar() {
		fatorial = new Fatorial();
	}

	@Test
	public void fatorialNaoRecursivoTest() {
		
		assertEquals(fatorial.fat(0), 1);
		assertEquals(fatorial.fat(1), 1);
		assertEquals(fatorial.fat(2), 2);
		assertEquals(fatorial.fat(3), 6);
		assertEquals(fatorial.fat(4), 24);
		assertEquals(fatorial.fat(5), 120);
	}

	@Test
	public void fatorialRecursivoTest() {
		
		assertEquals(fatorial.fatorialRecursivo(0), 1);
		assertEquals(fatorial.fatorialRecursivo(1), 1);
		assertEquals(fatorial.fatorialRecursivo(2), 2);
		assertEquals(fatorial.fatorialRecursivo(3), 6);
		assertEquals(fatorial.fatorialRecursivo(4), 24);
		assertEquals(fatorial.fatorialRecursivo(5), 120);
	}

}
