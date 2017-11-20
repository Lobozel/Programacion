package EjerciciosClase;

public class Triangulo {
private int lado1;
private int lado2;
private int lado3;

public Triangulo() {
}

public Triangulo(int lado1, int lado2, int lado3) {
	super();
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.lado3 = lado3;
}

public Triangulo(Triangulo t) {
	this.lado1 = t.lado1;
	this.lado2 = t.lado2;
	this.lado3 = t.lado3;
}

public int getLado1() {
	return lado1;
}

public void setLado1(int lado1) {
	this.lado1 = lado1;
}

public int getLado2() {
	return lado2;
}

public void setLado2(int lado2) {
	this.lado2 = lado2;
}

public int getLado3() {
	return lado3;
}

public void setLado3(int lado3) {
	this.lado3 = lado3;
}

@Override
public String toString() {
	return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
}

public int area() {
	double p = (lado1+lado2+lado3)/2.0;
	double area = Math.pow(p*(p-lado1)*(p-lado2)*(p-lado2),1/2);
	return (int)area;
}

public void areaString() {
	double p = (lado1+lado2+lado3)/2.0;
	double area = Math.pow(p*(p-lado1)*(p-lado2)*(p-lado2),1/2);
	System.out.println("El área es "+area);
}

public int Area(int lado1, int lado2, int lado3) {
	double p = (lado1+lado2+lado3)/2.0;
	double area = Math.pow(p*(p-lado1)*(p-lado2)*(p-lado2),1/2);
	return (int)area;
}

public void AreaString(int lado1, int lado2, int lado3) {
	double p = (lado1+lado2+lado3)/2.0;
	double area = Math.pow(p*(p-lado1)*(p-lado2)*(p-lado2),1/2);
	System.out.println("El área es "+area);

}

}
