package FicherosObjeto;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Principal {

	public static boolean uno(boolean creado) throws NoValidoException {
		if(!creado) {
			try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream ("/home/diurno/"))){
				FileOutputStream fos = new FileOutputStream("/home/diurno/fichero");
				@SuppressWarnings({ "resource", "unused" })
				ObjectOutputStream os = new ObjectOutputStream(fos);
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
			creado=true;
		}else
			throw new NoValidoException("El fichero ya está creado.");
		return creado;
	}
	
	public static void dos(boolean creado) throws NoValidoException{
		if(!creado)
			throw new NoValidoException("Debes crear el fichero primero.");
		
	}
	
	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menu=0;
		boolean creado=false;
		do {
			do {
				try {
					System.out.println("1. Crear fichero\n"
							+ "2. Añadir publicaciones\n"
							+ "3. Mostrar datos\n"
							+ "4. Salir del programa");
					System.out.println("Elige una opción: ");
					menu=br.read();
				}catch(IOException ioe) {
					System.out.println("Error leer los datos introducidos.");
				}
			}while(menu<1 || menu>4);
			switch (menu) {
			case 1:
				try {
					creado=uno(creado);
				}catch(NoValidoException nve) {
					nve.printStackTrace();
					
					try{
						Thread.sleep(500);
						System.out.println();
					}catch(InterruptedException e ){
						System.out.println("El proceso se ha interrumpido.");
					}
					
				}
				break;
			case 2:
				try {
					dos(creado);
				}catch(NoValidoException nve) {
					nve.printStackTrace();
					
					try{
						Thread.sleep(500);
						System.out.println();
					}catch(InterruptedException e ){
						System.out.println("El proceso se ha interrumpido.");
					}
					
				}
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("Gracias por usar mi programa.");
			}
		}while(menu!=4);
			
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Error.");
		}

	}

}
