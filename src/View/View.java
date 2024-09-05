package View;
import Controller.controller;

public class View {
	public static void main(String[] args) {
		
		for (int thread = 0; thread < 5; thread++) {
			Thread controlador = new controller(thread);
			controlador.start();
		}
	}

}
