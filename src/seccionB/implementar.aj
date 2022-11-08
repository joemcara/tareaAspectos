package seccionB;

public aspect implementar {
	before(): execution (void Adaptador.sacarYenes()){
		declare parents: Adaptador implements interfazAdapter;
	}
	
}
