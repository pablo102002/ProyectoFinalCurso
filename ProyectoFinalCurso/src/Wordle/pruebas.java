package Wordle;

import java.util.ArrayList;

public class pruebas {

	public static void main(String[] args) {
				
		ArrayList<String> palabrasDiccionario = new ArrayList<String>();
		palabrasDiccionario.add("HUESO");
		palabrasDiccionario.add("TIMAR");
		palabrasDiccionario.add("MIRAR");
		palabrasDiccionario.add("HACER");
		palabrasDiccionario.add("ASPAS");
		palabrasDiccionario.add("TRAES");
		palabrasDiccionario.add("OSTIA");
		palabrasDiccionario.add("LIMON");
		palabrasDiccionario.add("RATON");
		palabrasDiccionario.add("SITIO");
		
		
		String palabraResuelta;
		int numero = (int)(Math.random()*palabrasDiccionario.size()+1);
		palabraResuelta=palabrasDiccionario.get(numero);
		System.out.println(palabraResuelta);
	}

}
