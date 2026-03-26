package exemplosAbstracao;

public class AnimalMain {

	public static void main(String[] args) {

		Animal c  = new Cachorro("Bthoven: ");
		Animal g = new Gato("Garfield: ");
	
	c.emitirSom(); //cada um responde diferente
	g.emitirSom();
	
	c.dormir();
	g.dormir();
	
	
	
	
	
	
	
	
	}
}