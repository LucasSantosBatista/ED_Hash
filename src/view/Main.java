package view;

import controller.Dicionario;
import model.Palavra;

public class Main {
	public static void main(String[] args) {
		Palavra p1 = new Palavra();
		Palavra p2 = new Palavra();
		Palavra p3 = new Palavra();
		Palavra p4 = new Palavra();

		p1.verbete = "Cadeira";
		p1.significado = "Objeto para sentar";

		p2.verbete = "Teclado";
		p2.significado = "Dispositivo com teclas";

		p3.verbete = "Garrafa";
		p3.significado = "Objeto que armazena, preferencialmente, liquidos";

		p4.verbete = "Garfo";
		p4.significado = "Objeto para perfurar alimentos";

		Dicionario d = new Dicionario();
		try {
			d.adicionaPalavra(p1);
			d.adicionaPalavra(p2);
			d.adicionaPalavra(p3);
			d.adicionaPalavra(p4);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
