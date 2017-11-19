package T03_P2;

/**
 * <a href="https://github.com/Lobozel/Programacion/blob/master/PT/T03_P2/Ejercicio07.java"></a>
 * @author MiguelÁngel
 *
 */

public class Ejercicio07 { //Se abre la clase
	/**
	 * <h1>ENUNCIADO</h1>
	 * 
	 * Escribir un programa que determine y escriba la descomposición
	 * factorial de los números enteros comprendidos entre 1 900 y 2 000
	 */

	/**
	 * Este método se encargará de descomponer los números no primos.
	 * @param x
	 */
public static void factor(int x){

	//Compruebo si el número es primo o no
	int contaDiv=0; //Declaro una variable que cuenta por cuantos números es divisible, para saber si es primo o no.
	for (int cont=1;cont<=x;cont++)
		  if(x%cont==0)
		  contaDiv++;
	//**************************
	
	  //Si es primo, muestro que lo es y si no, escribo el descompongo factorial del número
	  if(contaDiv<=2 && x!=1)
		  System.out.println(x+" es primo.\n");
	  else{
		  //Descomposición factorial.
	System.out.println(x+": 1 ");
	int num=2; //2 es el primer número primo por el que se descomponen los números.
	while(x!=1)
		if(x%num==0){
			x=x/num;
			System.out.println("    "+num);
		}
		else
			num++;
	System.out.println();
	  }
}
	
public static void main(String[] args) { //Se abre el método main

	//Llamo al método con un bucle que va pasando desde el número 1900 hasta el 2000
	for (int cont=1900;cont<=2000;cont++)
		factor(cont);
	//**************************
	
	
} // Se cierra el método main

} // Se cierra la clase
