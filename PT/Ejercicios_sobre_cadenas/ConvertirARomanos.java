package Ejercicios_sobre_cadenas;

import java.util.Scanner;

public class ConvertirARomanos {

	public static String convertirARomano(int num) {
		String numromano="";
		/*
		 * cifras[0]=miles
		 * cifras[1]=centenas
		 * cifras[2]=decenas
		 * cifras[3]=unidades
		 */
		int[] cifras = new int[4];
		cifras[0]=num/1000;
		cifras[1]=num/100%10;
		cifras[2]=num/10%10;
		cifras[3]=num%10;
		String[] letraRomana = new String[] {"M","C","X","I","D","L","V"};
		
		
	      for (int i=1;i<=cifras[0];i++)
	             numromano+=letraRomana[0];
	      
	      
	      for(int i=1;i<cifras.length;i++)
	    	  if(cifras[i]==9)
	    		  numromano+=letraRomana[i]+letraRomana[i-1];
	    	  else if (cifras[i]>=5) {
	    		  numromano+=letraRomana[i+3];
	    		  for(int j=6;j<=cifras[i];j++)
	    			  numromano+=letraRomana[i];
	    	  }else if(cifras[i]==4)
	    		  numromano+=letraRomana[i]+letraRomana[i+3];
	    	  else
	    		  for(int j=1;j<=cifras[i];j++)
	    			  numromano+=letraRomana[i];
	    	  
	      
		return numromano;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		do { //Solo leo números menores de 4000 porque no puedo poner letras con el guión encima
		System.out.println("Introduce un número natural y lo convertiré en Romano (menor de 4000)");
		num=entrada.nextInt();
		}while(num>4000 || num<0);
		System.out.println("Resultado: "+convertirARomano(num));
		entrada.close();
	}

}
