package EjerciciosClase;

public class pruebahora {

	public static void main(String[] args) {
		hora hora1 = new hora();
		hora hora2 = new hora(23,59,59);
		hora hora3 = new hora(hora2);
		System.out.println(hora1.toString());
		hora2.setH(0);
		hora2.setM(13);
		hora3.setS(58);
		System.out.println(hora2.toString());
		for(int cont=0;cont<10;cont++) {
			hora2.Ssig();
			System.out.println(hora2.toString());
		}
		hora3.Sant();
		System.out.println(hora3.toString());
		System.out.println(hora.tiempoTranscurrido(hora2,hora3));
		System.out.println("Ha pasado "+hora2.Hora()+" desde la media noche.");
		System.out.println(hora3.hastaMediaNoche());
		

	}

}
