package Ejercicio04;

import java.util.Scanner;

/**
 * 
 * @author MiguelAngel
 *
 */
public class Fecha {//se abre la clase
	/**********************************
	 * <h1>Atributos de la clase</h1> *
	 **********************************/
	private int dia, mes, año;
	
	/********************************
	 * <h1>Métodos de la clase</h1> *
	 ********************************/
	
	//Constructor predeterminado con el 1-1-1900 como fecha por defecto.
	public Fecha(){
		this.dia=1;
		this.mes=1;
		this.año=1900;
	}
	
	//Constructor parametrizado con día, mes y año
	public Fecha(int dia, int mes, int año){
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		valida();
	}
	
	//leer(): pedirá al usuario el día(1 a 31), el mes(1 a 12) y el año(1900 a 2050)
	public void leer(){
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("Introce un día válido.");
			this.dia=entrada.nextInt();
		}while(this.dia<1 || this.dia>31);
		do{
			System.out.println("Introduce un mes válido.");
			this.mes=entrada.nextInt();
		}while(this.mes<1 || this.mes>12);
		do{
			System.out.println("Introduce un año entre 1900 y 2050.");
			this.año=entrada.nextInt();
		}while(this.año<1900 || this.año>2050);
		valida();
		entrada.close();
	}
	
	//bisiesto(): indicará si el año de la fecha es bisiesto o no
	public boolean bisiesto(){
		boolean bisiesto=false;
		if(this.año%4==0 || this.año%400==0 && this.año%100!=0)
			bisiesto=true;
		return bisiesto;
	}
	
	//diasMES(int):devolverá el número de días del mes que se le indique
	public int diasMes(int mes){
		int dias=0; //La inicializo para que no de error en el return.
		switch (mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			dias=31;
			break;
		case 4: case 6: case 9: case 11:
			dias=30;
			break;
		case 2:
			if(bisiesto()) //Entrará cuando sea true el boolean del método
				dias=29;
			else
				dias=28;
		}
		return dias;
	}
	
	/*
	 * valida(): comprobará si la fecha es correcta (entre 1-1-1900 y el 31-12-2050)
	 * si el dia no es correcto, lo pondrá a 1; si el mes no es correcto, lo pondrá a 1;
	 * y si el año no es correcto, lo pondrá a 1900. Será un método auxiliar (privado).
	 * Este método se llamará en el constructor parametrizado y en leer().
	 */
	private void valida(){
		if(this.mes<1 || this.mes>12)
			this.mes=1;
		if(this.dia<1 || this.dia>diasMes(this.mes))
			this.dia=1;
		if(this.año<1900 || this.año>2050)
			this.año=1900;
	}

	//Accedentes y mutadores
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
		
	//corta(): mostrará la fecha en formato corto (02-09-2003).
	public String corta(){
		if(this.dia<10 && this.mes<10)
			return "0"+this.dia+"-0"+this.mes+"-"+this.año;
		else if (this.dia<10)
			return "0"+this.dia+"-"+this.mes+"-"+this.año;
		else if (this.mes<10)
			return this.dia+"-0"+this.mes+"-"+this.año;
		else
			return this.dia+"-"+this.mes+"-"+this.año;
	}
	
	/*
	 * diasTranscurridos(): devolverá el número de días transcurridos desde el 1-1-1900
	 * hasta la fecha
	 */
	public int diasTranscurridos(){
		int dias=this.dia;
		for (int cont=this.mes;cont>1;cont--){
			dias+=this.diasMes(cont);
		}
		for (int cont=this.año;cont>1900;cont--){
			if(cont%4==0 || cont%400==0 && cont%100!=0)
				dias+=366;
			else
				dias+=365;
		}
		return dias;
	}
	
	/*
	 * diaSemana():devolverá el día de la semana de la fecha (0 para domingo, ..., 6 para sábado).
	 * El 1-1-1900 fue domingo.
	 */
	public int diaSemana(){
		/**
		 * las variables A, B, C, D y this.dia contendrán los coeficientes necesarios para calcular el día de la semana.
		 * la variable R contendrá el resultado siendo:
		 * Domingo 0, Lunes 1, ... , Sábado 6
		 * 
		 * <a href="https://www.gaussianos.com/como-calcular-que-dia-de-la-semana-fue/">Página de referencia</a>
		 */
		int A, B, C, D=0, R;
		/*
		 * Según el siglo, A tendrá un valor u otro, dada la siguiente tabla:
		 * 1700...1799 | 1800...1899 | 1900...1999 | 2000...2099 | 2100...2199 | 2200...2299
		 *     +5      |     +3      |     +1      |      0      |     -2      |     -4
		 */
		if(this.año>=1900 && this.año<=199)
			A=1;
		else
			A=0;
		/*
		 * Tomamos los dos últimos dígitos del año en cuestión y a ese número de dos cifras
		 * le sumamos un cuarto del mismo (despreciando los decimales). Ese será el valor de B.
		 */
		B=(int)(this.año/100);
		B+=(int)(B/4);
		/*
		 * Si el año es bisiesto y el mes es enero o febrero, C valdrá -1, en cualquier otro caso C=0.
		 */
		if(bisiesto() && this.mes==1 || this.mes==2)
			C=-1;
		else
			C=0;
		/*
		 * El valor de D dependerá de la siguiente tabla:
		 * Enero | Feb. | Marzo | Abril | Mayo | Junio | Julio | Agosto | Sept. | Oct. | Nov. | Dic. |
		 *   6   |  2   |   2   |   5   |  0   |   3   |  5    |   1    |   4   |   6  |  2   |  4   |
		 */
		switch (this.mes){
		case 5:
			D=0;
			break;
		case 8:
			D=1;
			break;
		case 2: case 3: case 11:
			D=2;
			break;
		case 6:
			D=3;
			break;
		case 9: case 12:
			D=4;
			break;
		case 4: case 7:
			D=5;
			break;
		case 1: case 10:
			D=6;
		}
		/*
		 * sumamos todos los coeficientes y después calculamos el resto módulo 7 del
		 * número que obtenemos. Esto lo podemos hacer restando 7 al resultado tantas
		 * veces como sea necesario hasta obtener un número entre 0 y 6.
		 */
		R=A+B+C+D+this.dia;
		while(R>6)
			R-=7;
		return R;
	}
	
	/*
	 * larga(): mostrará la fecha en formato largo, empezando por el día de la semana
	 * (martes 2 de septiembre de 2003)
	 */
	public String larga(){
		String fecha="";
		switch(diaSemana()){
		case 0: fecha+="Domingo ";
				break;
		case 1: fecha+="Lunes ";
		break;
		case 2: fecha+="Martes ";
		break;
		case 3: fecha+="Miercoles ";
		break;
		case 4: fecha+="Jueves ";
		break;
		case 5: fecha+="Viernes ";
		break;
		case 6: fecha+="Sábado ";
		}
		fecha+=this.dia+" de ";
		switch(this.mes){
		case 1: fecha+="enero";
			break;
		case 2: fecha+="febrero";
			break;
		case 3: fecha+="marzo";
			break;
		case 4: fecha+="abril";
			break;
		case 5: fecha+="mayo";
			break;
		case 6: fecha+="junio";
			break;
		case 7: fecha+="julio";
			break;
		case 8: fecha+="agosto";
			break;
		case 9: fecha+="septiembre";
			break;
		case 10: fecha+="octubre";
			break;
		case 11: fecha+="noviembre";
			break;
		case 12: fecha+="diciembre";
		}
		fecha+=" de "+this.año;
		return fecha;
	}
	
	/*
	 * fechaTras(long): hará que la fecha sea la correspondiente a haber transucrrido
	 * los días que se indiquen desde el 1-1-1900
	 */
	public void fechaTrans(long dias){
		this.dia=(int)(1+dias);
		this.mes=1;
		this.año=1900;
		while(bisiesto() && this.dia>=366 || this.dia>=365){
			if(bisiesto())
				this.dia-=366;
			else
				this.dia-=365;
			this.año++;
		}
		while(this.dia>=diasMes(this.mes)){
			this.dia-=diasMes(this.mes);
			this.mes++;
		}
	}
	
	/*
	 * diasEntre(Fecha): devolverá el número de días entre la fecha y la
	 * proprocionada.
	 */
	public int diasEntre(Fecha fecha){
		int dias=0;
		int mes=this.mes;
		int año=this.año;
		if (this.dia-fecha.dia>=0)
			dias+=this.dia-fecha.dia;
		else{
			dias+=diasMes(this.mes)-(fecha.dia-this.dia);
			mes++;
		}
		if(mes>=fecha.mes)
			for (int cont=mes;cont>fecha.mes;cont--)
				dias+=diasMes(cont);
		else
			for (int cont=fecha.mes;cont<mes;cont++){
				dias+=diasMes(cont);
				año++;
			}
		if(año>=fecha.año)
			for (int cont=año;cont>fecha.año;cont--){
				if(bisiesto())
					dias+=366;
				else
					dias+=365;
			}
		else
			for (int cont=fecha.año;cont<año;cont++){
				if(bisiesto())
					dias+=366;
				else
					dias+=365;
			}
		return dias;
	}
	
	//siguiente(): pasará al día siguiente
	public void siguiente(){
		this.dia++;
		if(this.dia>diasMes(this.mes)){
			this.dia=1;
			this.mes++;
			if(this.mes>12){
				this.mes=1;
				this.año++;
			}
		}
	}
	
	//anterior():pasará al día anterior
	public void anterior(){
		this.dia--;
		if(this.dia<0){
			this.dia=31;
			this.mes--;
			if(this.mes<0){
				this.mes=12;
				this.año--;
			}
		}
	}
	
	//copia():devolverá un clon de la fecha
	public Fecha copia(){
		Fecha copia = new Fecha(this.dia,this.mes,this.año);
		return copia;
	}
	
	//igualQue(Fecha): indica si la fecha es la misma que la proporcionada
	public boolean igualQue(Fecha fecha){
		boolean igual=true;
		if(this.dia!=fecha.dia || this.mes!=fecha.mes || this.año!=fecha.año)
			igual=false;
		return igual;
	}
	
	//menorQue(Fecha):indica si la fecha es anterior a la proporcionada
	public boolean menorQue(Fecha fecha){
		boolean menor=false;
		if(fecha.año>this.año)
			menor=true;
		return menor;
	}
	
	//mayorQue(Fecha):indica si la fecha es posterior a la porporcionada
	public boolean mayorQue(Fecha fecha){
		boolean mayor=false;
		if(fecha.año<this.año)
			mayor=true;
		return mayor;
	}
}//se cierra la clase
