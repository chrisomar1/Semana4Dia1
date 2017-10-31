package prod.suma.cadenas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraDeCadena calculadoraDeCadena = new CalculadoraDeCadena();
		
		//System.out.println(calculadoraDeCadena.addString(""));
		//System.out.println(calculadoraDeCadena.addString("4,4"));
		System.out.println(calculadoraDeCadena.addString2(""));
		System.out.println(calculadoraDeCadena.addString2("4,4"));
		System.out.println(calculadoraDeCadena.addString2("-4,4"));
		System.out.println(calculadoraDeCadena.addString2("n,4"));
		System.out.println(calculadoraDeCadena.addString2("4,d"));
	}

}
