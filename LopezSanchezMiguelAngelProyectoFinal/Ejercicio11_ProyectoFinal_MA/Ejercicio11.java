package Ejercicio11_ProyectoFinal_MA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Miguel�ngel
 *
 */
public class Ejercicio11 {
/**
 * 
 * @statement Realizar una aplicaci�n gr�fica que muestre el n�mero de pulsaciones de una serie de botones.
 * 
 */
	public static void main(String[] args) {
		ContadorDePulsaciones v = new ContadorDePulsaciones();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class ContadorDePulsaciones extends JFrame{
	
		
		private static final long serialVersionUID = 1L;

		public ContadorDePulsaciones(){
			setSize(300,160);
			setLocationRelativeTo(null);
			setTitle("PVP - 1 Versus 1");
			Versus panel = new Versus();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class Versus extends JPanel implements ActionListener{
		
		public static int cont1=0;
		public static int cont2=0;

		private static final long serialVersionUID = 1L;
		JLabel text1;
		JLabel text2;
		JButton btn1;
		JButton btn2;
		
		public Versus(){
			setLayout(null);
			
			text1 = new JLabel("Bot�n 1: 0 veces.");
			text1.setBounds(20,20,150,10);
			add(text1);
			text2 = new JLabel("Bot�n 2: 0 veces.");
			text2.setBounds(160,20,150,10);
			add(text2);
			
			
			btn1 = new JButton("BOT�N 1");
			btn1.setBounds(20,50,100,30);
			add(btn1);
			btn2 = new JButton("BOT�N 2");
			btn2.setBounds(160,50,100,30);
			add(btn2);
			
			btn1.addActionListener(this);
			btn2.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==btn1){
				cont1++;
				text1.setText("Bot�n 1: "+cont1+" veces.");
			}else if(e.getSource()==btn2){
				cont2++;
				text2.setText("Bot�n 2: "+cont2+" veces.");
			}
			
				
		}
	}

