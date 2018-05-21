package Ejercicio29_ProyectoFinal_MA;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class Ejercicio29 {
/**
 * 
 * @statement Realiza un programa que almacene y recupere un objeto persona en un Fichero. La clase persona
 * contiene los siguientes atributos:
 * · Nombre. Campo alfanumérico.
 * · Apellidos. Campo alfanumérico.
 * · Teléfono. Campo numérico.
 * Utiliza, para ello, un fichero de objetos persona y una clase serializable.
 * Intenta ser ordenado y crea 3 paquetes: uno para los métodos y clases de la interfaz gráfica Swing, otro
 * paquete para la clase serializable, y otro paquete para el manejo del fichero.
 * Ten en cuenta también que el campo Nombre tendrá 10 caracteres como máximo, el campo Apellido tendrá 20
 * caracteres como máximo y el Nif cumplirá el patrón de 7 u 8 números seguidos de una letra mayúscula. En
 * caso de que no se cumplan estas condiciones, una ventana emergente (Cuadro de dialogo) nos avisará de
 * nuestros errores y no se volcará la información al fichero.
 * 
 */	

	public static void main(String[] args) {
		FicheroPersona v = new FicheroPersona();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class FicheroPersona extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public FicheroPersona(){
			setSize(440,380);
			setLocationRelativeTo(null);
			setTitle("Mis Datos");
			PanelPersona panel = new PanelPersona();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class PanelPersona extends JPanel implements ActionListener{
		

		private static final long serialVersionUID = 1L;
		Persona p = new Persona();
		File archivo;
		ObjectOutputStream FPersona;
		JLabel text1;
		JTextField ruta;
		JButton crear;
		JLabel advertencia1;
		JLabel inf1, inf2, inf3, inf4;
		JTextField nombre, apellido, telefono, nif;
		JLabel advertencia2, advertencia3, advertencia4, advertencia5;
		JButton addP;
		JButton MostrarFichero;
		
		
		public PanelPersona(){
			setLayout(null);
			
			text1 = new JLabel("Introduce la ruta del fichero a crear y el nombre del fichero.");
			text1.setBounds(10,10,400,30);
			add(text1);
			
			ruta = new JTextField();
			ruta.setBounds(10,40,200,30);
			add(ruta);
			crear  = new JButton("CREAR");
			crear.setBounds(230,40,100,30);
			add(crear);
			
			advertencia1 = new JLabel();
			advertencia1.setForeground(Color.RED);
			advertencia1.setBounds(10,70,300,30);
			advertencia1.setVisible(false);
			add(advertencia1);
			
			inf1 = new JLabel("Nombre:");
			inf1.setBounds(10,95,100,30);
			add(inf1);
			inf2 = new JLabel("Apellido/s:");
			inf2.setBounds(230,95,100,30);
			add(inf2);
			
			nombre = new JTextField();
			nombre.setBounds(10,125,200,30);
			add(nombre);
			apellido = new JTextField();
			apellido.setBounds(230,125,200,30);
			add(apellido);
			
			advertencia2 = new JLabel();
			advertencia2.setForeground(Color.RED);
			advertencia2.setVisible(false);
			advertencia2.setBounds(10,155,200,30);
			add(advertencia2);
			advertencia3 = new JLabel();
			advertencia3.setForeground(Color.RED);
			advertencia3.setVisible(false);
			advertencia3.setBounds(230,155,200,30);
			add(advertencia3);
			
			inf3 = new JLabel("Teléfono:");
			inf3.setBounds(10,180,100,30);
			add(inf3);
			inf4 = new JLabel("NIF:");
			inf4.setBounds(230,180,100,30);
			add(inf4);
			
			telefono = new JTextField();
			telefono.setBounds(10,210,200,30);
			add(telefono);
			nif = new JTextField();
			nif.setBounds(230,210,200,30);
			add(nif);
			
			advertencia4 = new JLabel();
			advertencia4.setForeground(Color.RED);
			advertencia4.setVisible(false);
			advertencia4.setBounds(10,240,200,30);
			add(advertencia4);
			advertencia5 = new JLabel();
			advertencia5.setForeground(Color.RED);
			advertencia5.setVisible(false);
			advertencia5.setBounds(230,240,200,30);
			add(advertencia5);
			
			addP = new JButton("AÑADIR PERSONA");
			addP.setBounds(150,265,145,30);
			add(addP);
			
			MostrarFichero = new JButton("MOSTRAR FICHERO");
			MostrarFichero.setBounds(150,300,145,30);
			add(MostrarFichero);
			
			crear.addActionListener(this);
			addP.addActionListener(this);
			MostrarFichero.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e){
			advertencia1.setVisible(false);
			advertencia2.setVisible(false);
			advertencia3.setVisible(false);
			advertencia4.setVisible(false);
			advertencia5.setVisible(false);
			
			
			
			
			if(e.getSource()==crear){
				archivo = new File(ruta.getText());
				if(archivo.exists()){
					advertencia1.setVisible(true);
					advertencia1.setText("El fichero ya existe.");
				}
				try {
					FPersona = new ObjectOutputStream(new FileOutputStream(archivo, true));
				} catch (FileNotFoundException e1) {
					advertencia1.setVisible(true);
					advertencia1.setText("Eror fichero no encontrado.");
				} catch (IOException e1) {
					advertencia1.setVisible(true);
					advertencia1.setText("Eror E/S.");
				}
			}
			
			if( (e.getSource()==MostrarFichero || e.getSource()==addP) && archivo==null){
					advertencia1.setVisible(true);
					advertencia1.setText("El fichero no existe.");
			}else{
			
			if(e.getSource()==addP){
				if(nombre.getText().isEmpty()){
					advertencia2.setVisible(true);
					advertencia2.setText("El campo está vacio.");
				} else if(nombre.getText().length()>10){
					advertencia2.setVisible(true);
					advertencia2.setText("No más de 10 caracteres.");
				}
				if(apellido.getText().isEmpty()){
					advertencia3.setVisible(true);
					advertencia3.setText("El campo está vacio.");
				} else if(apellido.getText().length()>20){
					advertencia3.setVisible(true);
					advertencia3.setText("No más de 20 caracteres.");
				}
				if(telefono.getText().isEmpty()){
					advertencia4.setVisible(true);
					advertencia4.setText("El campo está vacio.");
				}
				if(nif.getText().isEmpty()){
					advertencia5.setVisible(true);
					advertencia5.setText("El campo está vacio.");
				} else if(!validarDNI(nif.getText())){
					advertencia5.setVisible(true);
					advertencia5.setText("NIF mal escrito.");
				}
				
				if(nombre.getText().length()<10 && apellido.getText().length()<20 && validarDNI(nif.getText())){
					p.setNombre(nombre.getText());
					p.setApellido(apellido.getText());
					p.setTelefono(telefono.getText());
					p.setNIF(nif.getText());
					
					try {
						FPersona.writeObject((Persona)p);
					} catch (IOException e1) {
						
					}
					
				}
				
			}
			
			if(e.getSource()==MostrarFichero){
				try {
					Desktop.getDesktop().open(archivo);
				} catch (IOException e1) {
					advertencia1.setVisible(true);
					advertencia1.setText("Eror E/S.");
				}	
			}	
			
			}
		}
		
		protected static boolean validarDNI(String dni){
			String[] letra = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N",
					"J","Z","S","Q","V","H","L","C","K","E"};
			int num;
			for(int i=0;i<dni.length()-1;i++)
				if(!Character.isDigit(dni.charAt(i)))
					return false;
			num=Integer.parseInt(dni.substring(0, dni.length()-1));
			System.out.println(num);
			System.out.println(String.valueOf(dni.charAt(dni.length()-1)));
			System.out.println(letra[(int)(num%23)]);
			if(!String.valueOf(dni.charAt(dni.length()-1)).equals(letra[(int)(num%23)]))
				return false;
			return true;
		}
		
	}


