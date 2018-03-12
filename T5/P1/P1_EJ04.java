package P1;

import java.util.Scanner;

public class P1_EJ04 {

	
	@SuppressWarnings("resource")
	public static void leerCoeficientes() throws NoValidoException{
		Scanner entrada = new Scanner(System.in);
		int a,b,c;
		System.out.println("Introduce el coeficiente a.");
		a=entrada.nextInt();
		if(a==0) {
			throw new NoValidoException("El coeficiente a no puede ser 0");
		}
		System.out.println("Introduce el coeficiente b.");
		b=entrada.nextInt();
		System.out.println("Introduce el coeficiente c.");
		c=entrada.nextInt();
		entrada.close();
		ecuacionCuadratica(a,b,c);

	}
	
	public static void ecuacionCuadratica(int a, int b, int c) {
		double discriminante, x1, x2;
		
		discriminante=((b*b)-(4*(a*c)));
		
		if (discriminante<0)
			System.out.println("La ecuación no tiene soluciones reales.");
		else if(discriminante==0){
			System.out.println("La ecuación solo tiene una solución real:");
			x1=(-b)/(2*a);
			System.out.println("La solucion es: "+x1);
		}
		else{
			System.out.println("La ecuación tiene dos soluciones reales.");
			x1=(-b)+Math.sqrt(discriminante)/(2*a);
			x2=(-b)-Math.sqrt(discriminante)/(2*a);
			System.out.println("Primera solución:\n"+x1+"\nSegunda solución:\n"+x2);
		}
	}
	
	public static void main(String[] args) {
		boolean fin=false;
		do {
			try {
				leerCoeficientes();
				fin=true;
			}catch(NoValidoException nv) {
				nv.printStackTrace();
				
				try{
					Thread.sleep(500);
					System.out.println();
				}catch(InterruptedException e ){
					System.out.println("El proceso se ha interrumpido.");
				}
				
				fin=false;
				
			}
		}while(!fin);

	}

}