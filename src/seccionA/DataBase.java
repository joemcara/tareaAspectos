package seccionA;

public class DataBase {
	private static DataBase dataBase;
	
	
	private DataBase() {}
	
	public static DataBase getIntance() {
		if(dataBase == null ) {
			dataBase = new DataBase();		
		}
		
		return dataBase;
	}
	
	public void print() {
		System.out.print("hola soy una base de datos");
	}
}
