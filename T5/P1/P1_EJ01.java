package P1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class P1_EJ01 {
/*
 * Implementar un programa que realice la división de dos números naturales, si
 * uno de los dos no lo es, que arroje una excepción.
 */
	public static float division(float num, float div) throws NoValidoException {
		float division=0;
		
		if (num<0 || div<0) {
			throw new NoValidoException("Ambos números deben ser naturales.");
		}else if(div==0) {
			throw new NoValidoException("No se puede dividir por 0.");
			
		}else
		division=num/div;
		return division;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num=0, div=0;
		boolean fin=false;
		
		
		while(!fin) {
			try {
			
				System.out.println("Introduce un numerador natural: ");
				num=entrada.nextFloat();
				System.out.println("Introduce un divisor natural: ");
				div=entrada.nextFloat();
				System.out.println("\nSolución:  {"+num+"/"+div+" = "+division(num,div)+"}");
			
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