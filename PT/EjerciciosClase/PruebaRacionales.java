package EjerciciosClase;
/*Declarar 3 opjetos
 *      racional1 (por defecto)
 *      racional2(de clase)
 *      racional3(de copia)
 *Realizar y escribir las siguientes operaciones:
 *		racional1+racional2
 *		racional2+racional3
 *		racional3*racional1
 *		racional1/racional2
 *En cualquier caso, simplificar el racional resultante
 */

public class PruebaRacionales {

	public static void main(String[] args) {
		Racionales racional1 = new Racionales();
		Racionales racional2 = new Racionales(7,2);
		Racionales racional3 = new Racionales(racional2);
		System.out.println("La suma del racional 1 y el racional 2 es:\n"+Racionales.sumaRacionales(racional1, racional2).toString()+"\n");
		System.out.println("La suma del racional 2 y el racional 3 es:\n"+Racionales.sumaRacionales(racional2, racional3).toString()+"\n");
		System.out.println("El producto del racional 3 y el racional 1 es:\n"+Racionales.productoRacionales(racional3, racional1).toString()+"\n");
		System.out.println("El resultado de la división entre el racional 1 y el racional 2 es:\n"+Racionales.divisionRacionales(racional1, racional2).toString()+"\n");

	}

}
