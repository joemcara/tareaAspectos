package seccionA;
import seccionA.CuentaAhorros;

public class Adaptador implements interfazAdapter{
	CuentaAhorros ahorros = new CuentaAhorros();
	public Adaptador(){
	}
	public double getSaldo(){
		return this.ahorros.getSaldoDisponible();
	}

	@Override
	public void sacarYenes(double yenes ){
 		double dolares = yenes/146.48;
		ahorros.retirarDinero(dolares);
	} 

	@Override
	public void depositarYenes(double yenes){
		double dolares = yenes/146.48;
		ahorros.depositar(dolares);
	}
}
