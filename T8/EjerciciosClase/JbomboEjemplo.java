package EjerciciosClase;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JbomboEjemplo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String[] lista=new String[] {"uno","dos","tres"};
		
		JFrame frame = new JFrame();
		
	    Container contentPane = frame.getContentPane();
	    
	    contentPane.setLayout(new GridLayout(0, 1));
	    
		JComboBox<String> box = new JComboBox<String>(lista);
//		box.setMaximumRowCount(1);
		
	    contentPane.add(box);
	    
	    frame.setLocation(700, 300);
	    frame.setSize(75, 25);
	    
	    frame.show();
		
	    
	}
}
