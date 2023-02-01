package  uniandes.dpoo.taller0.modificacion;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;

public class Modificacion
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Hello, World!");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}
}

