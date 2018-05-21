package Ejercicio22_ProyectoFinal_MA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 
 * @author MiguelÁngel
 *
 */
public class Ejercicio22 {
/**
 * 
 * @statement Crear un lector de fechas, lo usaremos sobre fechas de nacimiento, por ejemplo. La primera ventana mostrará
 * un botón, y dos ventanas de captura.
 * En la primera ventana escribiremos la fecha corta dd/mm/aaaa y en la segunda la fecha con letra: día del mes del año.
 * Al pulsar el botón saltará una nueva ventana en la que permite introducir la fecha de nacimiento: día mes y año.
 * Una vez seleccionado la fecha se mostrará en la primera ventana. Al pulsar el botón cancelar se borrarán los datos.
 * 
 */
	public static void main(String[] args) {
		MostrarFecha panel=null;
		FechaDeNacimiento v = new FechaDeNacimiento(panel);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class FechaDeNacimiento extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public FechaDeNacimiento(){
			
		}
		
		public FechaDeNacimiento(MostrarFecha panel){
			setSize(410,200);
			setLocationRelativeTo(null);
			setTitle("Tu Fecha de Nacimiento");
			panel = new MostrarFecha();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
		public FechaDeNacimiento(MostrarFecha mf, IntroducirFecha panel){
			setSize(410,200);
			setLocationRelativeTo(null);
			setTitle("Introduce la Fecha");
			panel = new IntroducirFecha(mf);
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class MostrarFecha extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		static FechaDeNacimiento v2 = null;
		JButton btnIntroducir;
		static JTextField tFFechaCorta;
		static JTextField tFFechaLarga;
		
		public MostrarFecha(){
			setLayout(null);
			
			btnIntroducir = new JButton("Introducir Fecha de Nacimiento");
			btnIntroducir.setBounds(100,20,210,30);
			add(btnIntroducir);
			
			tFFechaCorta = new JTextField();
			tFFechaCorta.setBounds(110, 70, 195, 30);
			tFFechaCorta.setEditable(false);
			tFFechaCorta.setHorizontalAlignment(JTextField.CENTER);
			add(tFFechaCorta);
			
			tFFechaLarga = new JTextField();
			tFFechaLarga.setBounds(60,120,300,30);
			tFFechaLarga.setEnabled(false);
			tFFechaLarga.setHorizontalAlignment(JTextField.CENTER);
			add(tFFechaLarga);
			
			btnIntroducir.addActionListener(this);
			
		}
		

		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==btnIntroducir){
				IntroducirFecha panel=null;
				v2 = new FechaDeNacimiento(MostrarFecha.this, panel);
			}
				
		}
	}
	
	
class IntroducirFecha extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		Calendar calendario= Calendar.getInstance();
		JLabel LTexto, barra1,barra2;
		JComboBox<Integer> cBDia, cBMes, cBAnio;
		JButton btnAceptar, btnCancelar;
		String fecha[]=null;
		
		public IntroducirFecha(MostrarFecha mf){
			setLayout(null);
			
			
			LTexto = new JLabel("El día se selecciona lo último.");
			LTexto.setBounds(10,10,300,30);
			add(LTexto);
			
			cBDia = new JComboBox<Integer>();
			cBDia.setEnabled(false);
			cBDia.setBounds(10,40,50,30);
			add(cBDia);
			barra1 = new JLabel("/");
			barra1.setBounds(63,40,30,30);
			add(barra1);
			cBMes = new JComboBox<Integer>();
			cBMes.addItem(null);
			for(int i=1;i<=12;i++){
				cBMes.addItem(i);
			}
			cBMes.setBounds(70,40,50,30);
			add(cBMes);
			barra2 = new JLabel("/");
			barra2.setBounds(123,40,30,30);
			add(barra2);
			cBAnio = new JComboBox<Integer>();
			cBAnio.addItem(null);
			for(int i=1900;i<=(int)(calendario.get(Calendar.YEAR));i++){
				cBAnio.addItem(i);
			}
			cBAnio.setBounds(130,40,100,30);
			add(cBAnio);
			
			btnAceptar = new JButton("ACEPTAR");
			btnAceptar.setBounds(10,80,100,30);
			add(btnAceptar);
			btnCancelar = new JButton("CANCELAR");
			btnCancelar.setBounds(130,80,100,30);
			add(btnCancelar);
			
			
			btnAceptar.addActionListener(this);
			btnCancelar.addActionListener(this);
			cBMes.addActionListener(this);
			cBAnio.addActionListener(this);
			
			
		}
		
		
		
		public void actionPerformed(ActionEvent e){
			
			if((cBMes.getSelectedItem()!=null && cBAnio.getSelectedItem()!=null) && (e.getSource()==cBMes || e.getSource()==cBAnio)){
				int dias=diasMes(cBMes.getSelectedIndex(),cBAnio.getSelectedIndex());
				cBDia.removeAllItems();
				for(int i=1;i<=dias;i++)
					cBDia.addItem(i);
				cBDia.setEnabled(true);
			}
			
			if(e.getSource()==btnCancelar){
				cBDia.removeAllItems();
				cBDia.addItem(null);
				cBDia.setSelectedIndex(0);
				cBMes.setSelectedIndex(0);
				cBAnio.setSelectedIndex(0);
				cBDia.setEnabled(false);
			}
			
			if(e.getSource()==btnAceptar && cBDia.getSelectedItem()!=null && cBMes.getSelectedItem()!=null && cBAnio.getSelectedItem()!=null){
				fecha = new String[]{String.valueOf(cBDia.getSelectedItem()),String.valueOf(cBMes.getSelectedItem()),String.valueOf(cBAnio.getSelectedItem())};
				auxiliar.FormatoFecha(fecha);
			}
				
		}
		
		protected static boolean bisiesto(int año){
			boolean bisiesto=false;
			if(año%4==0 || año%400==0 && año%100!=0)
				bisiesto=true;
			return bisiesto;
		}
		
		public static int diasMes(int mes, int año){
			int dias=0; 
			switch (mes){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				dias=31;
				break;
			case 4: case 6: case 9: case 11:
				dias=30;
				break;
			case 2:
				if(bisiesto(año)) 
					dias=29;
				else
					dias=28;
			}
			return dias;
		}
		
	}

class auxiliar extends MostrarFecha{
	
	private static final long serialVersionUID = 1L;

	public static void FormatoFecha(String[] fecha){
		if(fecha!=null){
			tFFechaCorta.setText(fecha[0]+"/"+fecha[1]+"/"+fecha[2]);
			switch(Integer.parseInt(fecha[1])){
			case 1:
				fecha[1]="Enero";
				break;
			case 2:
				fecha[1]="Febrero";
				break;
			case 3:
				fecha[1]="Marzo";
				break;
			case 4:
				fecha[1]="Abril";
				break;
			case 5:
				fecha[1]="Mayo";
				break;
			case 6:
				fecha[1]="Junio";
				break;
			case 7:
				fecha[1]="Julio";
				break;
			case 8:
				fecha[1]="Agosto";
				break;
			case 9:
				fecha[1]="Septiembre";
				break;
			case 10:
				fecha[1]="Octubre";
				break;
			case 11:
				fecha[1]="Noviembre";
				break;
			case 12:
				fecha[1]="Diciembre";
			}
			tFFechaLarga.setText(fecha[0]+" de "+fecha[1]+" de "+fecha[2]);
			v2.setVisible(false);
		}
	}
}
