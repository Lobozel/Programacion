package P1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class P1_EJ05 {
	
	double nivel;
	final int MAX_NIVEL=1000;
	
	public P1_EJ05(){
		System.out.println("¡Nuevo Silo creado!");
		System.out.println(this.mostrarCapacidad());
	}
	
	public P1_EJ05(P1_EJ05 silo){
		this.nivel=silo.getNivel();
		System.out.println(this.mostrarCapacidad());
	}
	
	public String mostrarCapacidad(){
		return "El silo tiene un nivel de "+this.nivel+"/"+this.MAX_NIVEL;
	}
	
	public int getMAX_NIVEL() {
		return MAX_NIVEL;
	}
	
	public double getNivel() {
		return nivel;
	}
	
	public void setNivel(double nivel) throws NoValidoException {
		if (nivel>this.MAX_NIVEL){
			this.nivel=this.MAX_NIVEL;
			throw new NoValidoException("El nivel actual del silo no puede superar"
					+ "el nivel máximo de este, el cual es "+this.MAX_NIVEL+"\n"+this.mostrarCapacidad());
		}else{
			this.nivel=nivel;	
			System.out.println(this.mostrarCapacidad());
		}
	}
	
	public void llenaSilo(double nivel) throws NoValidoException {
		if ((this.nivel+nivel)>this.MAX_NIVEL){
			System.out.println("Se ha añadido "+(this.MAX_NIVEL-this.nivel)+" a la capcidad actual del Silo");
			this.nivel=this.MAX_NIVEL;
			throw new NoValidoException("El nivel actual del silo no puede superar"
					+ "el nivel máximo de este, el cual es "+this.MAX_NIVEL+"\n"+this.mostrarCapacidad());
		}else{
			this.nivel+=nivel;	
			System.out.println("Se ha añadido "+nivel+" a la capacidad actual del Silo.");
			System.out.println(this.mostrarCapacidad());
		}
		
	}
	
	public void vaciaSilo(double nivel) throws NoValidoException {
		if ((this.nivel-nivel)<0){
			System.out.println("Se ha quitado "+(this.nivel)+" a la capcidad actual del Silo");
			this.nivel=0;
			throw new NoValidoException("El nivel actual del silo no puede superar"
					+ "el nivel máximo de este, el cual es "+this.MAX_NIVEL+"\n"+this.mostrarCapacidad());
		}else{
			this.nivel-=nivel;	
			System.out.println("Se ha quitado "+nivel+" a la capacidad actual del Silo.");
			System.out.println(this.mostrarCapacidad());
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean fin=false;
		
		P1_EJ05 Silo = new P1_EJ05();
		
		do{
			try{
				System.out.println("Introduce la capacidad inicial del silo.");
				
				Silo.setNivel(entrada.nextDouble());
				
				fin=true;
				
			}catch(NoValidoException ne){
				ne.printStackTrace();
				
				try{
					Thread.sleep(500);
					System.out.println();
				}catch(InterruptedException e ){
					System.out.println("El proceso se ha interrumpido.");
				}
				
				fin=false;
			
			}catch(java.util.InputMismatchException im) {
				JOptionPane.showMessageDialog(null, "No has introducido un número","ERROR",JOptionPane.ERROR_MESSAGE);
				entrada.nextLine();
			}
				
		}while(!fin);
		
		try {
			System.out.println("\nIntroduzca en cuanto quieres incrementar la capacidad actual del Silo.");
			Silo.llenaSilo(entrada.nextDouble());
			
		}catch(NoValidoException ne){
			ne.printStackTrace();
			
			try{
				Thread.sleep(500);
				System.out.println();
			}catch(InterruptedException e ){
				System.out.println("El proceso se ha interrumpido.");
			}
			
		}catch(java.util.InputMismatchException im) {
			JOptionPane.showMessageDialog(null, "No has introducido un número","ERROR",JOptionPane.ERROR_MESSAGE);
			entrada.nextLine();
		}
		
		try {
			System.out.println("\nIntroduzca en cuanto quieres reducir la capacidad actual del Silo.");
			Silo.vaciaSilo(entrada.nextDouble());

		}catch(NoValidoException ne){
			ne.printStackTrace();
			
			try{
				Thread.sleep(500);
				System.out.println();
			}catch(InterruptedException e ){
				System.out.println("El proceso se ha interrumpido.");
			}
		
		}catch(java.util.InputMismatchException im) {
			JOptionPane.showMessageDialog(null, "No has introducido un número","ERROR",JOptionPane.ERROR_MESSAGE);
			entrada.nextLine();
		}
		
		entrada.close();

	}

}
