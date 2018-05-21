package Ejercicio9_ProyectoFinal_MA;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Ejercicio9 {
/**
 * 
 * @statement Cada vez que se pulse uno de los botones, el fondo del botón se pondrá del color indicado.
 * 
 */
	public static void main(String[] args) {
		BotonesDeColores v = new BotonesDeColores();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class BotonesDeColores extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public BotonesDeColores(){
			setSize(260,160);
			setLocationRelativeTo(null);
			setTitle("Colores");
			Botones panel = new Botones();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class Botones extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		JButton azul;
		JButton amarillo;
		JButton rojo;
		JButton verde;
		
		public Botones(){
			setLayout(null);
			
			azul = new JButton("AZUL");
			azul.setBounds(20,20,100,30);
			add(azul);
			amarillo = new JButton("AMARILLO");
			amarillo.setBounds(140,20,100,30);
			add(amarillo);
			
			rojo = new JButton("ROJO");
			rojo.setBounds(20,80,100,30);
			add(rojo);
			verde = new JButton("VERDE");
			verde.setBounds(140,80,100,30);
			add(verde);
			
			azul.addActionListener(this);
			amarillo.addActionListener(this);
			rojo.addActionListener(this);
			verde.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e){
			
			azul.setBackground(null);
			amarillo.setBackground(null);
			rojo.setBackground(null);
			verde.setBackground(null);
			
			if(e.getSource()==azul){
				azul.setBackground(new Color(0,0,255));
			}else if(e.getSource()==amarillo){
				amarillo.setBackground(new Color(255,255,0));
			}else if(e.getSource()==rojo){
				rojo.setBackground(new Color(255,0,0));
			}else if(e.getSource()==verde){
				verde.setBackground(new Color(0,255,0));
			}
				
		}
	}

