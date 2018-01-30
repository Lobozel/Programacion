package Ejercicios_sobre_cadenas;

public class ConvertirARomanos {

	public static String convertirARomano(int num) {
		String numromano="";
		for(int i=1;i<=num/1000;i++)
			numromano+="M";
		return numromano;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
