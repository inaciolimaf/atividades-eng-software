package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DispenserTest {
	
	Dispenser dispen;
	@Test
	public void deveriaRetornarPrecoTest() {
		dispen = new Dispenser();
		assertEquals(50, dispen.dispense(50, 13));
	}
	@Test
	public void deveriaRetornarFalseAvaliableTest() {
		dispen = new Dispenser();
		assertFalse(dispen.available(18));
	}
}
