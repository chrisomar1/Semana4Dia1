package prueba;

import static org.junit.Assert.*;

import org.junit.Test;

import prod.Main;

public class testMain {

	@Test
	public void testLeerArchivo() {
		//fail("Not yet implemented");
		Main main = new Main();
		boolean resultado = main.leerArchivo("C:/Users/ChristianOmar/Documents/prueba3.txt");
	}

}
