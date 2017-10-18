package com.prueba;
import java.util.Scanner;
import java.io.IOException;
import com.salon4.llorar.*;

public class Main {
	
	public static int id = 0;
	public static long id2 = 0;
	
	public static final int valorFinal = 9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		id = 25;
		
		System.out.println("hola");
		System.out.println("Christian");
		
		int a = 1;
		int b = 81;
		int resultado = 0;
		
		resultado = a + b ;
		
		//Suma
		System.out.println("Suma: "+resultado);
		
		float d = 3.14592678f;
		float c = 10.34434343434f;
		float resf = 0.0f;
		
		resf = d + c;
		
		System.out.println("Suma de flotantes: "+resf);
		
		float z = b + d;
		
		System.out.println("El resultado es: "+z);
		
		//int y = b + d;   Nos dará un error ya que no podemos sumar un float e int y almacenar el resultado en un int.

		//Chicharronera
		double x1 = ((-b) + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		double x2 = ((-b) - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		System.out.println("Chicharronera: X1 = "+x1+" , X2 = "+x2);
		
		String cadena = "Parangaricutirimicuaro";
		
		//Float flotante = 0.0f;
		System.out.println("///////// Cadenas ////////");
		String cadenaCesar = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio = 3;
		System.out.println(cadena);
		for(int x = 0; x<cadena.length(); x++)
		{
			System.out.println(cadena.charAt(x));    //Acceder a cada cada letra de la cadena de caracteres
			//Hacer sustitución.
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x+espacio));
		}
		System.out.println(cadena);
		//Subcadenas
		System.out.println(cadena.substring(3, 6));
		//Minúsculas
		System.out.println(cadena.toLowerCase());
		
		//Arrays
		String [] meses = {"Jan","Feb", "Mar", "Apr", "May", 
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String [] sem = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		//Objetivo: mostrar enero, julio, noviembre, diciembre y marzo en la misma línea.
		System.out.print(meses[0]+" "+meses[6]+" "+meses[10]+" "+meses[11]+" "+meses[2]+" "+sem[0]+" "+sem[4]+" "+sem[1]+" ");
		
		//Fallo provocado
		//System.out.println(sem[8]);
		
		boolean x = true;
		boolean az = false;
		
		
		System.out.println("\n\n");
		//System.out.println(!x != !az);
		System.out.println("\n\n");
		
		//System.out.println(x && az);
		/*
		if(x == az)
		{
			System.out.println("Chana!!!");
		}
		else
		{
			System.out.println("Juana!!!");
		}*/
		//Bloque de palacio de fierro
		/*
		if(x == az)
		{
			System.out.println("Chana!!!");
		}
		else if(x == az)
		{
			System.out.println("Juana!!!");
		}
		else if(x == az)
		{
			System.out.println("Melón!!!");
		}
		else if(!x == !az)
		{
			System.out.println("Sandía!!!");
		}
		else if(!(x == !az))
		{
			System.out.println("La vieja del otro día!!!");
		}
		else
		{
			System.out.println("Ni modo!!!");
		}
		*/
		
		//Switch de la mexicana que fruta vendía.
		System.out.println("\n\n");
		
		/*String opcion = "Chana";
		Scanner lector = new Scanner(System.in);
		do
		{
			
			opcion = lector.nextLine();
			
			switch(opcion)
			{
			
			case "Chana":
				System.out.println("Chana!!");
				break;
			case "Juana":
				System.out.println("Juana!!");
				break;
			case "Chona":
				System.out.println("Chona!!");
				break;
			case "Christian":
				System.out.println("Gracias por visitar la aplicación");
				break;
			default:
				System.out.println("Ninguno!!");
				break;
			
			}
		}while(!opcion.equals("Christian"));	*/	
		
		//Le da equals el método
		/*String cadena5 = "Hola";
		
		if(cadena5.equals("Hola "))
		{
			System.out.println("Son iguales!!");
		}
		else
			System.out.println("No son iguales!!");*/
		
		//For each
		/*
		for(String i:meses)
		{
			System.out.print(i);
		}*/
		
		
		//Bucle while
		/*
		int contador = 0;
		while(contador < meses.length)
		{
			System.out.println((contador+1)+" : "+meses[contador]);
			contador++;
		}*/
		
		//CuentaPalabras cPlb = new CuentaPalabras(7);
		//cPlb.cuentaLetras();
		//cPlb.hola();

		
		//Bloque try and catch
		//Controlar excepciones
		//NullPointer, NumberFormat, OutOfBounds, IO, 
		/*try
		{
			int contador = 0;
			while(contador < 14)
			{
				System.out.println((contador+1)+" : "+meses[contador]);
				contador++;
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Excepción: "+ex);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Excepción: "+ex);
		}
		catch(ClassCastException ex)
		{
			System.out.println("Excepción: "+ex);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Excepción: "+ex);
		}
		catch(Exception ex)
		{
			System.out.println("Excepción: "+ex);
		}
		finally
		{
			//Bloque finally, se ejecuta sin importar si se llegó a la excepción
			System.out.println("Bloque finally");
		}
		
		System.out.println("Saliendo de la excepción...");*/
		
		
		//Instanciación de la clase, uso del constructor sobrecargado
		Estudiante estudiHambre = new Estudiante(2,"Juancho");
		//Obtener los datos de forma segura
		System.out.println(estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
		//Cambiar los valores
		estudiHambre.setCodigo(4);
		estudiHambre.setNombre("Gloria");
		//Obtener los datos de forma segura
		System.out.println("\n"+estudiHambre.getCodigo()+" : "+estudiHambre.getNombre());
		
		//Llamar al método sin modificador de acceso
		estudiHambre.probar();
		
		Sacapuntas sacaPuntas = new Sacapuntas(456,"filo");
		
		sacaPuntas.probarSacapuntas();
		
		id2++;
		System.out.println("\n Id del desorden: "+id2);
		//id2=id2++;
		//probarEstatico();
		
		//valorFinal = 0;
		
	} //Fin del main
	
	//Método estático
	/*public static void probarEstatico()
	{
		id = 99999;
		System.out.println("\n"+id);
		main(null);
	}*/
  
}
