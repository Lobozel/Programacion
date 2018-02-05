package Ejercicios_sobre_cadenas;

import java.util.Scanner;
/**
 * 
 * @author Miguel¡ngel
 *
 */
public class P04_E17 {

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
		
		//miles
	      for (int i=1;i<=cifras[0];i++)
	             numromano += "M";

	      //centenas
	      if(cifras[1]==9)
	          numromano+="CM";
	      else if (cifras[1]>=5) {
	                     numromano+="D";
	                     for (int i=6;i<=cifras[1];i++) {
	                            numromano+="C";
	                     }
	      } else if (cifras[1]==4) 
	                      numromano+="CD";
	      else
	           for (int i=1;i<=cifras[1];i++) 
	                         numromano+="C";
	                  
	      //decenas      
	      if(cifras[2]==9) 
	    	  numromano+="XC";
	       else if (cifras[2]>=5) {
	    	  numromano+="L";
	    	  for(int i=6;i<=cifras[2];i++)
	    		  numromano+="X";
	      }else if (cifras[2]==4)
	    	  numromano+="XL";
	      else
	    	  for(int i=1;i<=cifras[2];i++)
	    		  numromano+="X";
	      
	      //unidades
	      if(cifras[3]==9)
	    	  numromano+="IX";
	      else if(cifras[3]>=5) {
	    	  numromano+="V";
	    	  for(int i=6;i<=cifras[3];i++)
	    		  numromano+="I";
	      }else if(cifras[3]==4)
	    	  numromano+="IV";
	      else
	    	  for(int i=1;i<=cifras[3];i++)
	    		  numromano+="I";
	      
		return numromano;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		do { //Solo leo n˙meros menores de 4000 porque no puedo poner letras con el guiÛn encima
		System.out.println("Introduce un n˙mero natural y lo convertir· en Romano (menor de 4000)");
		num=entrada.nextInt();
		}while(num>4000 || num<0);
		System.out.println("Resultado: "+convertirARomano(num));
		entrada.close();
	}

}
