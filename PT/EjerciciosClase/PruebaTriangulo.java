package EjerciciosClase;

import java.util.Scanner;

public class PruebaTriangulo {

	public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n;
        do{
            System.out.println("Introduzca las veces que quiere introducir los triangulos:");
            n=entrada.nextInt();
            if (n<=0)
                System.out.println("Valor no valido");
        }while (n<=0);
        double mediaP=0, mediaS=0, mayorS=Integer.MIN_VALUE, menorS=Integer.MAX_VALUE, mayorP=Integer.MIN_VALUE, menorP=Integer.MAX_VALUE;
        int cont=0;
        for (cont=0;cont<n;cont++){
            System.out.println("Introduzca el vertice 1");
            Punto punto1=new Punto(entrada.nextInt(),entrada.nextInt());
            System.out.println("Introduzca el vertice 2");
            Punto punto2=new Punto(entrada.nextInt(),entrada.nextInt());
            System.out.println("Introduzca el vertice 3");
            Punto punto3=new Punto(entrada.nextInt(),entrada.nextInt());
            Triangulo triangulo=new Triangulo(punto1,punto2,punto3);
            if (triangulo.perimetro()>mayorP)
                mayorP=triangulo.perimetro();
            if (triangulo.perimetro()<menorP)
                menorP=triangulo.perimetro();
            if (triangulo.area()>mayorS)
                mayorS=triangulo.area();
            if (triangulo.area()<menorS)
                menorS=triangulo.area();
            mediaP=mediaP+triangulo.perimetro();
            mediaS=mediaS+triangulo.perimetro();
        }

        System.out.println("La media del perimetro es de "+(mediaP/cont));
        System.out.println("La media de la superficie es de "+(mediaS/cont));
        System.out.println("El perimetro mayor es "+mayorP);
        System.out.println("El perimetro menor es "+menorP);
        System.out.println("La superficie mayor es "+mayorS);
        System.out.println("La superficie menor es "+menorS);
        
        entrada.close();
}

}
