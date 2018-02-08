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
	public static void factor(int x) throws NoValidoException{
		
		if(x<0)
		throw new NoValidoException("El número no es natural.");
		
		int contaDiv=0; 
		for (int cont=1;cont<=x;cont++)
			  if(x%cont==0)
			  contaDiv++;
		
		  
		  if(contaDiv<=2 && x!=1)
			  throw new NoValidoException("Es un número primo.");
		  else{
			  
		System.out.println(x+": 1 ");
		int num=2; 
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
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		boolean fin=false;
		
		while(!fin) {
			
			try {
				
				System.out.println("Introduce un número entero positivo para calcular su factorial.");
				num=entrada.nextInt();
				
				factor(num);
				
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
