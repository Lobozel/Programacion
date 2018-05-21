package Ejercicio25_ProyectoFinal_MA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Ejercicio25 {
/**
 * 
 * @statement Convertidor de monedas: Realizar una aplicación que convierta cantidades expresas en Euros, yenes,
 * dólares o libras. Para seleccionar la moneda de origen usaremos un combo, y tendrá 4 botones para seleccionar
 * la moneda a la que haremos el cambio.
 * 
 */
	public static void main(String[] args) {
		ConversorDeMonedas v = new ConversorDeMonedas();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class ConversorDeMonedas extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public ConversorDeMonedas(){
			setSize(500,500);
			setLocationRelativeTo(null);
			setTitle("Conversor de Monedas");
			Dinero panel = new Dinero();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class Dinero extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		JLabel text1, text2, text3, resultado;
		JComboBox<String> monedaOrigen;
		JTextField cantidad;
		JButton euros, yenes, dolares, libras;
		
		public Dinero(){
			setLayout(null);
			
			text1 = new JLabel("Escoge la moneda de origen:");
			text1.setBounds(20,20,300,30);
			add(text1);
			monedaOrigen = new JComboBox<String>();
			monedaOrigen.addItem("(Euros) €");
			monedaOrigen.addItem("(Yenes) ¥");
			monedaOrigen.addItem("(Dólares) $");
			monedaOrigen.addItem("(Libras) £");
			monedaOrigen.setBounds(200,20,100,30);
			add(monedaOrigen);
			
			text2 = new JLabel("Cantidad: ");
			text2.setBounds(70,60,100,30);
			add(text2);
			cantidad = new JTextField("0");
			cantidad.setBounds(200,60,100,30);
			add(cantidad);
			
			text3 = new JLabel("Escoge el cambio de la moneda:");
			text3.setBounds(20,100,300,30);
			add(text3);
			euros = new JButton("€");
			euros.setBounds(20,130,50,30);
			add(euros);
			yenes = new JButton("¥");
			yenes.setBounds(85,130,50,30);
			add(yenes);
			dolares = new JButton("$");
			dolares.setBounds(150,130,50,30);
			add(dolares);
			libras = new JButton("£");
			libras.setBounds(215,130,50,30);
			add(libras);
			
			resultado = new JLabel("");
			resultado.setVisible(false);
			resultado.setBounds(100,160,300,30);
			add(resultado);
			
			euros.addActionListener(this);
			yenes.addActionListener(this);
			dolares.addActionListener(this);
			libras.addActionListener(this);
			
			
		}
		
		public void actionPerformed(ActionEvent e){
			
			resultado.setVisible(true);
			resultado.setText("Trás cambio: ");
			try{
				if(e.getSource()==euros){
					if(monedaOrigen.getSelectedItem().equals("(Euros) €"))
						resultado.setText(resultado.getText()+Integer.parseInt(cantidad.getText())+"€");
					else if(monedaOrigen.getSelectedItem().equals("(Yenes) ¥"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*0.0076600)+"€");
					else if(monedaOrigen.getSelectedItem().equals("(Dólares) $"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*0.848139733)+"€");
					else if(monedaOrigen.getSelectedItem().equals("(Libras) £"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*1.14252988)+"€");
				}
				if(e.getSource()==yenes){
					if(monedaOrigen.getSelectedItem().equals("(Euros) €"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*130.64277)+"¥");
					else if(monedaOrigen.getSelectedItem().equals("(Yenes) ¥"))
						resultado.setText(resultado.getText()+Integer.parseInt(cantidad.getText())+"¥");
					else if(monedaOrigen.getSelectedItem().equals("(Dólares) $"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())+110.77263)+"¥");
					else if(monedaOrigen.getSelectedItem().equals("(Libras) £"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*149.23121)+"¥");
				}
				if(e.getSource()==dolares){
					if(monedaOrigen.getSelectedItem().equals("(Euros) €"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*1.179051)+"$");
					else if(monedaOrigen.getSelectedItem().equals("(Yenes) ¥"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*0.00901)+"$");
					else if(monedaOrigen.getSelectedItem().equals("(Dólares) $"))
						resultado.setText(resultado.getText()+Integer.parseInt(cantidad.getText())+"$");
					else if(monedaOrigen.getSelectedItem().equals("(Libras) £"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*1.347101)+"$");
				}
				if(e.getSource()==libras){
					if(monedaOrigen.getSelectedItem().equals("(Euros) €"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*0.87475)+"£");
					else if(monedaOrigen.getSelectedItem().equals("(Yenes) ¥"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*0.00670)+"£");
					else if(monedaOrigen.getSelectedItem().equals("(Dólares) $"))
						resultado.setText(resultado.getText()+(Integer.parseInt(cantidad.getText())*0.74229)+"£");
					else if(monedaOrigen.getSelectedItem().equals("(Libras) £"))
						resultado.setText(resultado.getText()+Integer.parseInt(cantidad.getText())+"£");
				}
			}catch(NumberFormatException nf){
				resultado.setText("Introduce un número válido.");
			}
			
			
				
		}
	}

