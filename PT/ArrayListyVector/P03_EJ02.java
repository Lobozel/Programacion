package ArrayListyVector;

import java.util.Vector;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class P03_EJ02 {

	protected static void alumnosSemipresenciales(Vector<Alumnos> array){
		int cont=0;
		for(int i=0;i<array.size();i++)
			if(array.get(i).getCondicion()==Condicion.semipresencial){
				System.out.println(array.get(i).toString()+"\n");
				cont++;
			}
		System.out.println("Hay "+cont+" alumnos semipresenciales.");
	}
	
	protected static void notaDeMayorAMenor(Vector<Alumnos> array){
		Alumnos aux;
		boolean fin=true;
		for(int i=array.size();i>0 && fin;i--){
			fin=false;
			for(int j=0;j<i-1;j++){
				if(array.get(j+1).getNota()>array.get(j).getNota()){
					aux = new Alumnos(array,(j+1));
					array.set(j+1, array.get(j));
					array.set(j, aux);
					fin=true;
				}
			}
		}
		
		System.out.println("Lista de alumnos ordenados por nota de mayor a menor:\n");
		
		for(int i=0;i<array.size();i++)
			System.out.println(array.get(i).toString()+"\n");
	}
	
	protected static void notaDeMenorAMayor(Vector<Alumnos> array){
		Alumnos aux;
		boolean fin=true;
		for(int i=array.size();i>0 && fin;i--){
			fin=false;
			for(int j=0;j<i-1;j++){
				if(array.get(j+1).getNota()<array.get(j).getNota()){
					aux = new Alumnos(array,(j+1));
					array.set(j+1, array.get(j));
					array.set(j, aux);
					fin=true;
				}
			}
		}
		
		System.out.println("Lista de alumnos ordenados por nota de menor a mayor:\n");
		
		for(int i=0;i<array.size();i++)
			System.out.println(array.get(i).toString()+"\n");
	}
	
	protected static void OrdenadosPorNombres(Vector<Alumnos> array){
		 Alumnos aux;
		 boolean fin=true;
		 //Ordeno por nombres primero
		 for(int i=array.size();i>0 && fin;i--){
			 fin=false;
			 for(int j=0;j<i-1;j++){
				 if(array.get(j+1).getNombre().compareTo(array.get(j).getNombre())<0){
					 aux = new Alumnos(array,(j+1));
				     array.set(j+1, array.get(j));
					 array.set(j, aux);
					 fin=true;
				 }
			 }
		 }
		 //Después ordeno por apellidos
		 for(int i=array.size();i>0 && fin;i--){
			 fin=false;
			 for(int j=0;j<i-1;j++){
				 if(array.get(j+1).getNombre().compareTo(array.get(j).getNombre())<=0 &&
						 array.get(j+1).getApellido().compareTo(array.get(j).getApellido())<0){
					 aux = new Alumnos(array,(j+1));
				     array.set(j+1, array.get(j));
					 array.set(j, aux);
					 fin=true;
				 }
			 }
		 }
		 
		 System.out.println("Lista de alumnos ordenados por nombre y apellidos:\n");
			
			for(int i=0;i<array.size();i++)
				System.out.println(array.get(i).toString()+"\n");
	}
	
	public static void main(String[] args) {
		Vector<Alumnos> array = new Vector<Alumnos>();
		char fin='c';	
		int menu=0;
		
		while(fin!='f'){
			array.add(Alumnos.leerAlumnos());
			System.out.println("\n\n¿Deseas añadir otro alumno?\n"
						+ "(Cualquier tecla para continuar)\n"
						+ "('f' para terminar)");
			fin=Coche.entrada.next().charAt(0);
		}
		
		do{
		do{
		System.out.println("\n\n¿Qué información desea conocer?\n"
				+ "1.-Información sobre todos los alumnos.\n"
				+ "2.-Todos los alumnos de semipresencial y su cantidad.\n"
				+ "3.-Alumnos ordenados por su nota de mayor a menor\n"
				+ "4.-Alumnos ordenados por su nota de menor a mayor .\n"
				+ "5.-Alumnos ordenados por su nombre y apellido.\n"
				+ "0.-Salir.");
		menu=Coche.entrada.nextInt();
		}while(menu<0 || menu>5);
		switch(menu){
		case 1:
			for(int i=0;i<array.size();i++)
				System.out.println(array.get(i).toString()+"\n");
			break;
		case 2:
			alumnosSemipresenciales(array);
			break;
		case 3:
			notaDeMayorAMenor(array);
			break;
		case 4:
			notaDeMenorAMayor(array);
			break;
		case 5:
			OrdenadosPorNombres(array);
		}
		}while(menu!=0);

	}

}
