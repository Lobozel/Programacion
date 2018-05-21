package Ejercicio10_ProyectoFinal_MA;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * 
 * @author Miguel¡ngel
 *
 */
public class Ejercicio10 {
/**
 * 
 * @statement Cada vez que se pulse uno de los botones el fondo del marco se pondr· del color indicado
 * 
 */
	public static void main(String[] args) {
		PintarMarco v = new PintarMarco();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class PintarMarco extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public PintarMarco(){
			setSize(260,160);
			setLocationRelativeTo(null);
			setTitle("Colores");
			MarcoDeColores panel = new MarcoDeColores();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class MarcoDeColores extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		JToggleButton azul;
		JToggleButton amarillo;
		JToggleButton rojo;
		JToggleButton verde;
		
		public MarcoDeColores(){
			setLayout(null);
			
			azul = new JToggleButton("AZUL");
			azul.setBounds(20,20,100,30);
			add(azul);
			amarillo = new JToggleButton("Amarillo");
			amarillo.setBounds(140,20,100,30);
			add(amarillo);
			
			rojo = new JToggleButton("ROJO");
			rojo.setBounds(20,80,100,30);
			add(rojo);
			verde = new JToggleButton("VERDE");
			verde.setBounds(140,80,100,30);
			add(verde);
			
			azul.addActionListener(this);
			amarillo.addActionListener(this);
			rojo.addActionListener(this);
			verde.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e){
			JToggleButton btn = (JToggleButton) e.getSource();
			
			if(btn.isSelected()){
				if(e.getSource()==azul){
					setBackground(Color.BLUE);
				}
				if(e.getSource()==amarillo){
					setBackground(Color.YELLOW);
				}
				if(e.getSource()==rojo){
					setBackground(Color.RED);
				}
				if(e.getSource()==verde){
					setBackground(Color.GREEN);
				}
			}
	
		}
	}


