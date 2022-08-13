package view;

import Controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController recFat = new FatorialController();
		int valor = 12;
		int resultado = recFat.fatorial(valor);
		System.out.println(resultado);
	}

}
