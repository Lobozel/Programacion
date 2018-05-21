package Ejercicio20_ProyectoFinal_MA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * 
 * @author MiguelÁngel
 *
 */
public class Ejercicio20 {
/**
 * 
 * @statement Construye una aplicación para cobrar facturas de una pizzería, en ella debes incluir todos los
 * elementos que se han visto en clase. El diseño lo dejo a vuestra elección.
 * Hay tres tipos de pizzas (pequeña, mediana y familiar) cada una de ellas con un precio fijo que se mantiene
 * para pizzas de hasta tres ingredientes. Cada ingrediente adicional se cobra a un precio fijo y se selecciona
 * de un desplegable con los ingredientes posibles.
 * La aplicación debe mostrar el total a pagar por las pizzas teniendo en cuenta que el IVA es de  21%.
 * 
 */
	public static void main(String[] args) {
		PizzaMiguel v = new PizzaMiguel();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

	class PizzaMiguel extends JFrame{
	

		private static final long serialVersionUID = 1L;

		public PizzaMiguel(){
			setSize(450,520);
			setLocationRelativeTo(null);
			setTitle("PizzaMiguel en Casa");
			CreaTuPizza panel = new CreaTuPizza();
			add(panel);
			setVisible(true);
			setResizable(false);
		}
		
	}
	
	class CreaTuPizza extends JPanel implements ActionListener{
		
		static double precio=6;
		static String[] tamaños = new String[]{"Pequeña 6€","Mediana 8.50€","Familiar 12€"};
		static String[] salsas = new String[]{"SIN SALSA","BARBAACOA CRÉME","BBQ CREME DOBLE","BARBACOA",
				"BARBACOA DOBLE","BURGER","BURGER DOBLE","CARBONARA","CARBONARA DOBLE","JALISCO","JALISCO DOBLE",
				"TOMATE Y ORÉGANO","TOMATE Y ORÉGANO DOBLE"};
		static String[] extras = new String[]{"No quiero nada, gracias","EXTRA BARBACOA","SALSA CÉSAR",
				"SALSA STEAK & GRILL","EXTRA TOMATE CONFITADO"};
		static String[] ingredientes = new String[]{"Nada","5 Quesos","Aceitunas negras","Anchoas","Atún","Bacon",
				"Carne de vacuno","Cebolla","Cerdo Nueva Orleand","Champión","Gambas","Jalapeños","Maíz",
				"Pepinillo al gusto","Pepperoni","Pimiento asado","Pimiento morrón","Pimiento verde",
				"Piña (¿enserio?)","Pollo marinado","Pops de pollo","Pulled Pork","Queso cheddar","Queso de rulo",
				"Queso provolone","Queso suizo curado","Rúcula","Salchicha","Tomate natural","York"};
		
		private static final long serialVersionUID = 1L;
		JLabel text1;
		JComboBox<String> tamaño;
		JLabel text2;
		JComboBox<String> salsa;
		JLabel text3;
		JComboBox<String> extra;
		JLabel text4;
		JCheckBox topping;
		JLabel text5;
		JRadioButton gratinado;
		JLabel text6;
		JComboBox<String> ing1;
		JComboBox<String> ing2;
		JComboBox<String> ing3;
		JLabel text7;
		JComboBox<String> ing4;
		JComboBox<String> ing5;
		JComboBox<String> ing6;
		JComboBox<String> ing7;
		JComboBox<String> ing8;
		JButton calcular;
		JLabel text8;
		
		public CreaTuPizza(){
			setLayout(null);
//			setBackground(Color.BLACK);
			
			text1 = new JLabel("Tamaño:");
			text1.setBounds(20,20,100,30);
			add(text1);
			tamaño = new JComboBox<String>();
			for(String i:tamaños)
				tamaño.addItem(i);
			tamaño.setBounds(120,20,180,30);
			add(tamaño);
			
			text2 = new JLabel("Salsa:");
			text2.setBounds(20,70,100,30);
			add(text2);
			salsa = new JComboBox<String>();
			for(String i:salsas)
				salsa.addItem(i);
			salsa.setSelectedItem("TOMATE Y ORÉGANO");
			salsa.setBounds(120,70,180,30);
			add(salsa);
			
			text3 = new JLabel("¿Algún extra?:");
			text3.setBounds(20,120,100,30);
			add(text3);
			extra = new JComboBox<String>();
			for(String i:extras)
				extra.addItem(i);
			extra.setBounds(120,120,180,30);
			add(extra);
			
			text4 = new JLabel("¿Con Topping?:");
			text4.setBounds(20,160,100,30);
			add(text4);
			topping = new JCheckBox("Topping a base de mozzarella");
			topping.setBounds(120,160,300,30);
			add(topping);
			
			text5 = new JLabel("¿La Gratinamos?:");
			text5.setBounds(15,190,200,30);
			add(text5);
			gratinado = new JRadioButton("Gratinada (1€ extra)");
			gratinado.setBounds(120,190,300,30);
			add(gratinado);
			
			text6 = new JLabel("3 Ingredientes gratuitos:");
			text6.setBounds(150,230,300,20);
			add(text6);
			
			ing1 = new JComboBox<String>();
			for(String i:ingredientes)
				ing1.addItem(i);
			ing1.setBounds(20,265,120,30);
			add(ing1);
			ing2 = new JComboBox<String>();
			for(String i:ingredientes)
				ing2.addItem(i);
			ing2.setBounds(160,265,120,30);
			add(ing2);
			ing3 = new JComboBox<String>();
			for(String i:ingredientes)
				ing3.addItem(i);
			ing3.setBounds(300,265,120,30);
			add(ing3);
			
			text6 = new JLabel("Ingredientes extra 1€ cada uno:");
			text6.setBounds(130,305,300,20);
			add(text6);
			
			ing4 = new JComboBox<String>();
			for(String i:ingredientes)
				ing4.addItem(i);
			ing4.setBounds(20,335,120,30);
			add(ing4);
			ing5 = new JComboBox<String>();
			for(String i:ingredientes)
				ing5.addItem(i);
			ing5.setBounds(160,335,120,30);
			add(ing5);
			ing6 = new JComboBox<String>();
			for(String i:ingredientes)
				ing6.addItem(i);
			ing6.setBounds(300,335,120,30);
			add(ing6);
			
			ing7 = new JComboBox<String>();
			for(String i:ingredientes)
				ing7.addItem(i);
			ing7.setBounds(95,380,120,30);
			add(ing7);
			ing8 = new JComboBox<String>();
			for(String i:ingredientes)
				ing8.addItem(i);
			ing8.setBounds(235,380,120,30);
			add(ing8);
			
			calcular = new JButton("Hacer Pedido");
			calcular.setBounds(150,430,150,30);
			add(calcular);
			
			text8 = new JLabel("El Coste del pedido es de 18€");
			text8.setVisible(false);
			text8.setBounds(140,460,300,30);
			add(text8);
			
			tamaño.addActionListener(this);
			calcular.addActionListener(this);
			gratinado.addActionListener(this);
			ing4.addActionListener(this);
			ing5.addActionListener(this);
			ing6.addActionListener(this);
			ing7.addActionListener(this);
			ing8.addActionListener(this);
			
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==tamaño){
				String seleccion = (String) tamaño.getSelectedItem();
				if("Pequeña 6€".equals(seleccion))
					precio=6;
				else if("Mediana 8.50€".equals(seleccion))
					precio=8.5;
				else if("Familiar 12€".equals(seleccion))
					precio=12;
			}
			if(e.getSource()==gratinado && gratinado.isSelected())
				precio+=1;
			else if(e.getSource()==gratinado && !gratinado.isSelected())
				precio--;
			if(e.getSource()==ing4 && ing4.getSelectedIndex()!=0)
				precio++;
			else if(e.getSource()==ing4 && ing4.getSelectedIndex()==0)
				precio--;
			if(e.getSource()==ing5 && ing5.getSelectedIndex()!=0)
				precio++;
			else if(e.getSource()==ing5 && ing5.getSelectedIndex()==0)
				precio--;
			if(e.getSource()==ing6 && ing6.getSelectedIndex()!=0)
				precio++;
			else if(e.getSource()==ing6 && ing6.getSelectedIndex()==0)
				precio--;
			if(e.getSource()==ing7 && ing7.getSelectedIndex()!=0)
				precio++;
			else if(e.getSource()==ing7 && ing7.getSelectedIndex()==0)
				precio--;
			if(e.getSource()==ing8 && ing8.getSelectedIndex()!=0)
				precio++;
			else if(e.getSource()==ing8 && ing8.getSelectedIndex()==0)
				precio--;
			
			text8.setVisible(false); //Al hacer cualquier cambio en el precio, deja de mostrarse el costo del pedido.
			
			if(e.getSource()==calcular){
			text8.setText("El coste del pedido es de "+(precio+precio*21/100)+"€");
			text8.setVisible(true);
			}
				
		}
	}

