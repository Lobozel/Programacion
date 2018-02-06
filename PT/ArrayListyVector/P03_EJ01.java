package ArrayListyVector;

import java.util.ArrayList;
/**
 * 
 * @author MiguelÁngel
 *
 */
public class P03_EJ01 {
	
	protected static void cochesPorMarca(ArrayList<Coche> array){
		String marca="";
		int cont=0;
		System.out.println("Introduce la marca.");
		marca=Coche.entrada.next();
		System.out.println("Los coches con esa marca son:");
		for(int i=0;i<array.size();i++)
			if(array.get(i).getMarca().equals(marca)){
				array.get(i).toString();
				cont++;
			}
		System.out.println("Hay un total de "+cont+" coches con esa marca.");
	}
	
	protected static void cochesPorKms(ArrayList<Coche> array){
		int km=0;
		do{
			System.out.println("Introduce los kms.");
			km=Coche.entrada.nextInt();
		}while(km<0);
		
		System.out.println("Los coches con esos o más kms son:\n");
		
		for(int i=0;i<array.size();i++)
			if(array.get(i).getKm()<km)
				array.get(i).toString();
	}
	protected static void cochesConMasKms(ArrayList<Coche> array){
		int MayorKm=Integer.MIN_VALUE;
		
		for(int i=0;i<array.size();i++)
			if(array.get(i).getKm()>MayorKm)
				MayorKm=array.get(i).getKm();
		
		System.out.println("Los coches con más kilómetros son:\n");
		for(int i=0;i<array.size();i++)
			if(array.get(i).getKm()==MayorKm)
				System.out.println(array.get(i).toString());
		
	}
	
	protected static void cochesPorCombustible(ArrayList<Coche> array){
		String combustible="";
		int cont=0;
		System.out.println("Introduce la marca.");
		combustible=Coche.entrada.next();
		System.out.println("Los coches con ese tipo de combustible son:");
		for(int i=0;i<array.size();i++)
			if(array.get(i).getMarca().equals(combustible)){
				array.get(i).toString();
				cont++;
			}
		System.out.println("Hay un total de "+cont+" coches con ese tipo de combustible.");
	}
	
	protected static void kmsOrdenados(ArrayList<Coche> array){
		ArrayList<Coche> aux = new ArrayList<Coche>();
		boolean fin=true;
		for(int i=array.size();i>0 && fin;i--){
			fin=false;
			for(int j=0;j<i-1;j++){
				if(array.get(j+1).getKm()<array.get(j).getKm()){
					aux.set(j, array.get(j+1));
					array.set(j+1, array.get(j));
					array.set(j, aux.get(j));
					fin=true;
				}
			}
		}
		
		System.out.println("Lista de coches ordenada por kms:\n");
		
		for(int i=0;i<array.size();i++)
			array.get(i).toString();
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Coche> array = new ArrayList<Coche>();
		char fin='c';	
		int menu=0;
		
		while(fin!='f'){
			array.add(Coche.leerCoche());
			System.out.println("\n\n¿Deseas añadir otro coche?\n"
						+ "(Cualquier tecla para continuar)\n"
						+ "('f' para terminar)");
			fin=Coche.entrada.next().charAt(0);
		}
		
		do{
		do{
		System.out.println("\n\n¿Qué información desea conocer?\n"
				+ "1.-Información sobre todos los coches.\n"
				+ "2.-Todos los coches de una marca determinada.\n"
				+ "3.-Todos los coches con menos número de kilómetros del especificado.\n"
				+ "4.-El coche o coches con mayor número de kilómetros .\n"
				+ "5.-Todos los coches de un tipo de combustible determinado.\n"
				+ "6.-Información sobre todos los coches ordenados por su número de kilómetros de menor a mayor.\n"
				+ "0.-Salir.");
		menu=Coche.entrada.nextInt();
		}while(menu<0 || menu>5);
		switch(menu){
		case 1:
			for(int i=0;i<array.size();i++)
				System.out.println(array.get(i).toString()+"\n");
			break;
		case 2:
			cochesPorMarca(array);
			break;
		case 3:
			cochesPorKms(array);
			break;
		case 4:
			cochesConMasKms(array);
			break;
		case 5:
			cochesPorCombustible(array);
			break;
		case 6:
			
		}
		}while(menu!=0);
		
	}

}
