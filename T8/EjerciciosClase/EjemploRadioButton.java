package EjerciciosClase;


import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class EjemploRadioButton{    

	  public static void main(String args[]) {
		    JFrame frame = new JFrame();
		    Container contentPane = frame.getContentPane();
		    contentPane.setLayout(new GridLayout(0, 1));
		    ButtonGroup group = new ButtonGroup();
		    JRadioButton option = new JRadioButton("Acción", true);
		    group.add(option);
		    contentPane.add(option);
		    option = new JRadioButton("Tren", false);
		    group.add(option);
		    contentPane.add(option);
		    option = new JRadioButton("Coche", false);
		    group.add(option);
		    contentPane.add(option);
		    frame.setSize(200, 200);
		    frame.show();
		  }  
}