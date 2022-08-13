package Controller;

public class FatorialController {

	public FatorialController() {
		super();
	}

	public int fatorial (int valor) {
		//Condição de parada	
		if ( valor <= 1) {
			return 1;
		} else
			return valor * fatorial(valor - 1);
	}
}
