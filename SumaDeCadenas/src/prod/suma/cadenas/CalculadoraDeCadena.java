package prod.suma.cadenas;

public class CalculadoraDeCadena 
{
	public CalculadoraDeCadena()
	{
		
	}
	
	public int addString(String cadena)
	{
		int n = 0;
		if(!cadena.isEmpty())
		{
			char coma = ',';
			char puntoYComa = ';';
			char barra = '\\';
			
			for(int x=0; x<cadena.length();x++)
			{
				
				if((cadena.charAt(x) == '-')&&Character.isDigit(cadena.charAt(x+1))&&x<cadena.length())
				{
					return n = Integer.parseInt(String.valueOf(cadena.charAt(x+1)))*-1; 
				}
				
				if(Character.isDigit(cadena.charAt(x)) && (Integer.parseInt(String.valueOf(cadena.charAt(x))) > -1))
				{
					n += Integer.parseInt(String.valueOf(cadena.charAt(x)));
				}
				/*
				if(Character.isDigit(cadena.charAt(x)) && (Integer.parseInt(String.valueOf(cadena.charAt(x))) > -1))
				{
					n += cadena.charAt(x);
				}
				*/
			}
			
			return n;
		}
		else
		{
			return n;
		}
			

		
	}
	
	public int addString2(String cadena)
	{
		int n=0;
		//"4,4"
		
		if(!cadena.isEmpty())
		{
			String[] arreglo = cadena.split(",");
			for(int y=0; y<arreglo.length;y++)
			{
				if(arreglo[y].matches("[0-4]"))  //expresion regular de numero
				{
					n += Integer.parseInt(arreglo[y]);
				}
				else
				{
					if((arreglo[y].matches("[A-Z]"))||(arreglo[y].matches("[a-z]")))
							{
								return 0;
							}
					if((Integer.parseInt(arreglo[y])<0))
					return n=Integer.parseInt(arreglo[y]);
					/*else
						return 0;*/
				}
			}
		}
		
		
		else
		{
			return n;
		}
		
		return n;
	}

}
