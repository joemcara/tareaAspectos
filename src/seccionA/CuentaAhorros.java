package seccionA;

public class CuentaAhorros {
	private double dolares;
	
	public CuentaAhorros(){
	} 

	public double getSaldoDisponible(){
		return this.dolares;
	} 

	public void retirarDinero(double dolares){
	 	this.dolares -= dolares;
	} 

	public void depositar(double dolares){
		this.dolares += dolares;
	}
}
