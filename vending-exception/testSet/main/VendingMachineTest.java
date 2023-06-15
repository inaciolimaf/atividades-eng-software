package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {
	VendingMachine vend;
	@Test
	public void inicializarMaquinaTest() {
		vend = new VendingMachine();
		assertEquals("Inicialinzação com valor 0 para currValue", 0,  vend.currValue);
		assertEquals("Inicialinzação com valor 0 para totValue", 0,  vend.totValue);
		assertTrue(vend.d != null);
		assertTrue(vend.d instanceof Dispenser);
	}
	
	@Test
	public void deveriaTerMoeda25InsertCoinTest() {
		vend = new VendingMachine();
		vend.insertCoin();
		assertTrue("Recebendo moeda 25", vend.currValue==25); 
	}
	
	@Test
	public void deveriaRetornar50MoedasTest() {
		vend = new VendingMachine();
		vend.insertCoin();
		vend.insertCoin();
		assertTrue("Retornando o valor depositado", vend.returnCoin()==50);
	}
	@Test
	public void deveriaZerarCurrValueTest() {
		vend = new VendingMachine();
		vend.insertCoin();
		vend.insertCoin();
		vend.returnCoin();
		assertTrue("Retornando o valor depositado", vend.currValue==0);
	}
	@Test
	public void deveriaAumentar50TotValueTest() {
		vend = new VendingMachine();
		vend.insertCoin();
		vend.insertCoin();
		vend.vendItem(3);
		assertEquals("Aumentando o valor comprado", 50, vend.totValue);
	}
}
