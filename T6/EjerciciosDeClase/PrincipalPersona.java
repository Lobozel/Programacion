package EjerciciosDeClase;

public class PrincipalPersona{
	  public static void main (String[] args){
	    Empleado e=new Empleado("Luis", "Calle Cita II", 21,"Administrador");
	    System.out.println(e.toString());
	    Cliente c = new Cliente("Carmen", "Calle Otra 121", 22, 500.0);
	    System.out.println(c.toString());
	    Persona[] persona=new persona[3];
	    persona[0]=new Empleado("Ana","Calle del Pea 12", 25,"Jefe-RRHH");
	    persona[1]=new Cliente("Eva","Calle Nueva 12", 30,1000);
	    persona[2]=new Empleado("Jose", "Calle Vieja 45",35,"Administrativo");
	    for(Persona p: persona)
	      System.out.println(p.toString());
	   }
	 
	  class Empleado{
		  
		  
	  }
	  
	  class Cliente{
		  
	  }
}