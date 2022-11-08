package ec.edu.espol.main;

import seccionA.DataBase;

public class Tarea {

	public static void main(String[] args) {
		DataBase bd1 = DataBase.getIntance();
		bd1.print();
	}

}
