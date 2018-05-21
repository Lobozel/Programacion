package Ejercicio6_ProyectoFinal_MA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Ejercicio6 {
/**
 * @statement Pida dos valores y los sume o los reste, mostrando el resultado mediante una etiqueta.
 */
	
	public static void main(String[] args) {
		VentanaSumaYResta v = new VentanaSumaYResta();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class VentanaSumaYResta extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public VentanaSumaYResta(){
			setSize(260,200);
			setLocationRelativeTo(null);
			setTitle("Sumas y Restas");
			SumaYResta panel = new SumaYResta();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class SumaYResta extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		JTextField numA;
		JTextField numB;
		JButton suma;
		JButton resta;
		JLabel resultado;
		
		public SumaYResta(){
			setLayout(null);
			
			numA = new JTextField();
			numA.setBounds(20, 20, 100, 30);
			add(numA);
			numB = new JTextField();
			numB.setBounds(140, 20, 100, 30);
			add(numB);
			
			suma = new JButton("Sumar");
			suma.setBounds(30,70,80,30);
			add(suma);
			resta = new JButton("Restar");
			resta.setBounds(150,70,80,30);
			add(resta);
			
			suma.addActionListener(this);
			resta.addActionListener(this);
			
			resultado = new JLabel("El resultado es:");
			add(resultado);
			
			
		}
		
		public void actionPerformed(ActionEvent e){
			try{
				resultado.setBounds(80,110,300,10);
				if(e.getSource()==suma){
					resultado.setText("El resultado es "+(Integer.parseInt(numA.getText())+Integer.parseInt(numB.getText())));
				}else if(e.getSource()==resta){
					resultado.setText("El resultado es "+(Integer.parseInt(numA.getText())-Integer.parseInt(numB.getText())));
				}
			}catch(NumberFormatException nf){
				resultado.setBounds(2,110,300,10);
				resultado.setText("No has introducido valores de tipo númerico.");
			}
		}
	}

