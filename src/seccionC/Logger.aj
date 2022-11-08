package seccionC;

public aspect Logger {
	
	pointcut elegido() : execution(* eleccion(..) );
	after() returning(Gobierno g) : elegido(){
		System.out.println("El presidente elegido es: " + g.getPresidente());
	}
	
}
