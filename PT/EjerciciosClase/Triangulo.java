package EjerciciosClase;

import EjerciciosClase.Punto;

public class Triangulo {
    private Punto Vertice1, Vertice2, Vertice3;

    public Triangulo() {
        Punto punto1=new Punto(3,4);
        Punto punto2=new Punto();
        Punto punto3=new Punto(1,-2);
        Vertice1 = punto1;
        Vertice2 = punto2;
        Vertice3 = punto3;
    }

    public Triangulo(Triangulo t) {
        Vertice1 = t.Vertice1;
        Vertice2 = t.Vertice2;
        Vertice3 = t.Vertice3;
    }

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        Vertice1 = vertice1;
        Vertice2 = vertice2;
        Vertice3 = vertice3;
    }

    public Punto getVertice1() {
        return Vertice1;
    }

    public Punto getVertice2() {
        return Vertice2;
    }

    public Punto getVertice3() {
        return Vertice3;
    }

    public void setVertice1(Punto vertice1) {
        Vertice1 = vertice1;
    }

    public void setVertice2(Punto vertice2) {
        Vertice2 = vertice2;
    }

    public void setVertice3(Punto vertice3) {
        Vertice3 = vertice3;
    }

    @Override
    public String toString() {
        return "A(" + Vertice1 +
                ") B(" + Vertice2 +
                ") C(" + Vertice3 +
                ')';
    }

    public double perimetro(){
        Punto punto1=new Punto(this.getVertice1());
        Punto punto2=new Punto(this.getVertice2());
        Punto punto3=new Punto(this.getVertice3());
        return punto1.distancia(punto2)+punto2.distancia(punto3)+punto3.distancia(punto1);
    }

    public double area(){
        Punto punto1=new Punto(this.getVertice1());
        Punto punto2=new Punto(this.getVertice2());
        Punto punto3=new Punto(this.getVertice3());
        double semiperimetro = this.perimetro()/2;
        return Math.pow(semiperimetro*(Math.pow((semiperimetro-punto1.distancia(punto2)),2)*Math.pow((semiperimetro-punto2.distancia(punto3)), 2)*Math.pow((semiperimetro-punto2.distancia(punto3)),2)),0.5);
    }

}