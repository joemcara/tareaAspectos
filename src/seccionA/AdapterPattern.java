package seccionA;

public class AdapterPattern {
	public interface interfazAdapter {
		public abstract void sacarYenes(double yenes);
		public abstract void depositarYenes(double yenes);
	}
	
	
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
}
