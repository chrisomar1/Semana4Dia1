package test.suma.cadena;

import static org.junit.Assert.*;

import org.junit.Test;

import prod.suma.cadenas.CalculadoraDeCadena;

public class CalculadoraDeCadenasTest {

	@Test
	public void testAddString() {
		//fail("Not yet implemented");
		CalculadoraDeCadena calculadoraDeCadenas = new CalculadoraDeCadena();
		int resultado = calculadoraDeCadenas.addString("");
		int resultado2 = calculadoraDeCadenas.addString("4,4");
		int resultado3 = calculadoraDeCadenas.addString("-4,4");
		int resultado4 = calculadoraDeCadenas.addString("4;4");
		int resultado5 = calculadoraDeCadenas.addString("n,4");
		System.out.println("\n"+resultado+"\n"+resultado2+"\nXXX: "+resultado3+"\n"+resultado4+"\n"+resultado5);
	}

}
