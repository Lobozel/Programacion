package EjerciciosClase;
/*
 * declarar atributos
 * declarar constructores (por defecto, de clase, de copia)
 * setters and getters
 * toString
 * metodos para operaciones aritméticas (suma, resta, producto, division)
 */
public class Racionales {
private int numerador, denominador;

public Racionales() {
	this.numerador=1;
	this.denominador=2;
}

public Racionales(int numerador, int denominador) {
	if(numerador!=0 && denominador!=0) {
	this.numerador = numerador;
	this.denominador = denominador;
	}
	else
		System.out.println("El numerador y el denominador tienen que ser distintos de 0.");
}

public Racionales(Racionales r) {
	this.numerador = r.numerador;
	this.denominador = r.denominador;
}

public int getNumerador() {
	return numerador;
}

public void setNumerador(int numerador) {
	if(numerador!=0)
	this.numerador = numerador;
	else
		System.out.println("El numerador tiene que ser distinto de 0.");
}

public int getDenominador() {
	return denominador;
}

public void setDenominador(int denominador) {
	if (denominador!=0)
	this.denominador = denominador;
	else
		System.out.println("El denominador tiene que ser distinto de 0.");
}

@Override
public String toString() {
	return numerador+"\n--\n"+denominador;
}

/*
 * Método para calcular el máximo común divisor de dos
 * números enteros positivos. Algoritmo de Euclides.
 */
private int mcd(int a, int b) {
    int r;
    while (a % b != 0) {
      r = a % b;
      a = b;
      b = r;
    }
    return b;
 }
/*
 * Método para simplificar una fracción que represente
 * un racional.
 * Por ejemplo: 60/-18 --> -10/3
 */
private void simplificar() {
	int absNum = Math.abs(numerador);
    int absDen = Math.abs(denominador);
    int signo = denominador/absDen;
    int s = mcd(absNum,absDen);
    numerador = signo*(numerador/s);
    denominador = signo*(denominador/s);
}
public static Racionales sumaRacionales(Racionales r1, Racionales r2) {
	Racionales sum = new Racionales();
	if(r1.denominador==r2.denominador) {
		sum.setDenominador(r1.denominador);
		sum.setNumerador(r1.numerador+r2.numerador);
	}
	else {
		sum.setNumerador(r1.numerador*r2.denominador+r2.numerador*r1.denominador);
		sum.setDenominador(r1.denominador*r2.denominador);
	}
	sum.simplificar();
	return sum;
}
public static Racionales restaRacionales(Racionales r1, Racionales r2) {
	Racionales resta = new Racionales();
	if(r1.denominador==r2.denominador) {
		resta.setDenominador(r1.denominador);
		resta.setNumerador(r1.numerador-r2.numerador);
	}
	else {
		resta.setNumerador(r1.numerador*r2.denominador-r2.numerador*r1.denominador);
		resta.setDenominador(r1.denominador*r2.denominador);
	}
	resta.simplificar();
	return resta;
}
public static Racionales productoRacionales(Racionales r1, Racionales r2) {
	Racionales producto = new Racionales();
	producto.setNumerador(r1.numerador*r2.numerador);
	producto.setDenominador(r1.denominador*r2.denominador);
	producto.simplificar();
	return producto;
}
public static Racionales divisionRacionales(Racionales r1, Racionales r2) {
	Racionales division = new Racionales();
	division.setNumerador(r1.numerador*r2.denominador);
	division.setDenominador(r1.denominador*r2.numerador);
	division.simplificar();
	return division;
}

}
