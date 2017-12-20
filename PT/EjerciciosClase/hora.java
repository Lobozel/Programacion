package EjerciciosClase;

public class hora {
private int h,m,s;

public hora() {
	h=13;
}

public hora(int h, int m, int s) {
	this.h = h;
	this.m = m;
	this.s = s;
}

public hora(hora hora) {
	this.h = hora.h;
	this.m = hora.m;
	this.s = hora.s;
}

public int getH() {
	return h;
}

public void setH(int h) {
		this.h = h;
}

public int getM() {
	return m;
}

public void setM(int m) {
		this.m = m;
}

public int getS() {
	return s;
}

public void setS(int s) {
		this.s = s;
}

@Override
public String toString() {
	return "hora [h=" + h + ", m=" + m + ", s=" + s + "]";
}

public String Hora() {
	return h+":"+m+":"+s;
}

public boolean ValidarHora(int h, int m, int s) {
	if (h>=0 && h<=23 && m>=0 && m<=59 && s>=0 && s<=59)
		return true;
	else
		return false;
}

public void Ssig() {
	s+=1;
	if (s>59) {
		s-=60;
		m+=1;
		if (m>59) {
			m-=60;
			h+=1;
			if (h>23)
				h-=24;
		}
	}
}

public void Sant() {
	s-=1;
	if(s<0) {
		s+=60;
		m-=1;
		if (m<0) {
			m+=60;
			h-=1;
			if(h<0)
				h+=24;
		}
	}
}

public static String tiempoTranscurrido(hora hora1, hora hora2) {
	int hora, minuto, segundo;
	if (hora1.getH()>hora2.getH()) {
		hora=hora1.getH()-hora2.getH();
		if(hora2.getM()>hora1.getM()) {
			hora-=1;
			minuto=hora2.getM()-hora1.getM();
		}
		else
			minuto=hora1.getM()-hora2.getM();
		if(hora2.getS()>hora2.getS()) {
			minuto-=1;
			segundo=hora2.getS()-hora1.getS();
		}
		else
			segundo=hora1.getS()-hora2.getS();	
	}
	else {
		hora=hora2.getH()-hora1.getH();
		if(hora1.getM()>hora2.getM()) {
			hora-=1;
			minuto=hora1.getM()-hora2.getM();
		}
		else
			minuto=hora2.getM()-hora1.getM();
		if(hora1.getS()>hora2.getS()) {
			minuto-=1;
			segundo=hora1.getS()-hora2.getS();
		}
		else
			segundo=hora2.getS()-hora1.getS();	
	}
	return "Entre "+hora1.Hora()+" y "+hora2.Hora()+" ha transcurrido "+hora+":"+minuto+":"+segundo;
}
public String hastaMediaNoche() {
	int hora=23-h;
	int minuto=59-m;
	int segundo=60-s;
	return "Falta "+hora+":"+minuto+":"+segundo+" hasta la media noche.";
}
}
