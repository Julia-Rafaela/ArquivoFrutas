package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.Ifrutas;

public class main {

	public static void main(String[] args) {
	Ifrutas arqCont = new ArquivosController();
	
	
	String path = "C:\\TEMP\\generic_food.csv" ;

	try {
	
		arqCont.ReadFile(path);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	}

}
