package P1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class P1_EJ02 {
/*
 * Realizar un programa que calcule el factorial de cualquier número entero
 * positivo. El programa debe controlar entre otras excepciones que el
 * número sea negativo y que exista desbordamiento.
 */
	public static int factorial(int x) throws NoValidoException{
		int factorial=1;
		if (x<0)
			throw new NoValidoException("No es un número positivo.");
		else if (x==0)
			return 1;
		else 
			for(int i=x;i>=1;i--) {
				if(factorial*i>=Integer.MAX_VALUE)
					throw new NoValidoException("El número es demasiado grande, pruebe con uno menor.");
				else
					factorial*=i;
			}
			
		return factorial;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		boolean fin=false;
		
		while(!fin) {
			
			try {
				
				System.out.println("Introduce un número entero positivo para calcular su factorial.");
				num=entrada.nextInt();
				
				System.out.println("El factorial de "+num+" es "+factorial(num));
				
				fin=true;
				
			}catch(NoValidoException nv) {
				
				nv.printStackTrace();
				
				try{
					Thread.sleep(1000);
					System.out.println();
				}catch(InterruptedException e ){
					System.out.println("El proceso se ha interrumpido.");
				}
				
			}catch(java.util.InputMismatchException im) {
				JOptionPane.showMessageDialog(null, "No has introducido un número","ERROR",JOptionPane.ERROR_MESSAGE);
				entrada.nextLine();
			}
			
		}
		
		
		entrada.close();

	}

}
