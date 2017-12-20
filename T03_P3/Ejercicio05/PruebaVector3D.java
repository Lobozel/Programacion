package Ejercicio05;
/**
 * 
 * @author MiguelAngel
 *
 */
public class PruebaVector3D { // se abre la clase

	public static void main(String[] args) { // se abre el main
		/*
		 * Creo una instancia de un objeto tipo Vector3D al cual llamo vector3D1
		 * usando el constructor por defecto
		 */
		Vector3D vector3D1 = new Vector3D();
		/*
		 * Creo una instancia de un objeto tipo Vector3D al cual llamo vector3D2
		 * usando el constructor de clase
		 */
		Vector3D vector3D2 = new Vector3D(1,1,1);
		/*
		 * Creo una instancia de un objeto tipo Vector3D al cual llamo vector3D3
		 * usando el constructor de copia
		 */
		Vector3D vector3D3 = new Vector3D(vector3D2);
		
		
		//Comparo el vector3D2 y el vector3D3 con el método equal
		System.out.println("Comparando 2 vectores tridimensionales:");
		if(vector3D2.equal(vector3D3))
			System.out.println("Ambos vectores son iguales.");
		else
			System.out.println("Se trata de diferentes vectores tridimensionales.");
		

		//Muestro las coordenadas de vector3D1
		System.out.println("\n"+vector3D1.toString()+"\n");
		//Translado y muestro las coordenadas de vector3D1
		System.out.println(vector3D1.trasladar().toString());

	} // se cierra el main

} // se cierra la clase
