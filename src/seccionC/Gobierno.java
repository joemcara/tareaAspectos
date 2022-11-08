package seccionC;

public class Gobierno {
	private String presidente;
	private static Gobierno instancia;
	
	private Gobierno(String nombre) {
		presidente = nombre;
	}
	
	public static Gobierno eleccion(String ganador) {
		if (instancia == null) {
			instancia = new Gobierno(ganador);
		}
		return instancia;
	}

	public String getPresidente() {
		return presidente;
	}
}
