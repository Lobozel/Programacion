package array_unidimensionales;

import java.util.Scanner;

public class mediapositivomedianegativo {
/*
 * Array de 10 elementos el cual calcula la media de los números negativos y
 * positivos del mismo, números ingresados por teclado.
 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] numeros=new double[10];
		double[] positivos = new double[2];
		double[] negativos = new double[2];
		positivos[0]=0; positivos[1]=0;
		negativos[0]=0; negativos[1]=0;
		
		for(int i=0;i<numeros.length;i++){
			do{
			System.out.println("Introduce un número positivo o negativo, distinto de 0.");
			numeros[i]=entrada.nextInt();
			}while(numeros[i]==0);
			if(numeros[i]>0){
				positivos[0]+=numeros[i];
				positivos[1]++;
			}
			else{
				negativos[0]+=numeros[i];
				negativos[1]++;
			}
		}
		
		
		positivos[0]=positivos[0]/positivos[1];
		negativos[0]=negativos[0]/negativos[1];
		
		System.out.printf("%s%.2f\n","La media de los números positivos es ",positivos[0]);
		System.out.printf("%s%.2f\n","La media de los números negativos es ",negativos[0]);
		
		entrada.close();

	}

}
