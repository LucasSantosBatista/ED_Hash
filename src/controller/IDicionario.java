package controller;

import model.Palavra;

public interface IDicionario {
	public void adicionaPalavra(Palavra p) throws Exception;

	public Palavra buscaPalavra(Palavra p) throws Exception;

	public void removePalavra(Palavra p) throws Exception;

	public void listarPalavras(String letra) throws Exception;
}
