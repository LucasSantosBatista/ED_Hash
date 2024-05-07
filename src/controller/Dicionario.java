package controller;

import br.edu.fateczl.Lista;
import model.Palavra;

public class Dicionario implements IDicionario {

	@SuppressWarnings("rawtypes")
	private Lista[] dicionario;

	public Dicionario() {
		dicionario = new Lista[26];
		inicializaTabelaHash();
	}

	private void inicializaTabelaHash() {
		int tamanho = dicionario.length;
		for (int i = 0; i < tamanho; i++) {
			dicionario[i] = new Lista<Palavra>();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void adicionaPalavra(Palavra p) throws Exception {
		int posicao = p.hashCode();
		Lista<Palavra> lista = dicionario[posicao];
		int qtd = lista.size();
		if (qtd == 0) {
			lista.addFirst(p);
		} else {
			lista.addLast(p);
		}

	}

	@Override
	public Palavra buscaPalavra(Palavra p) throws Exception {
		int posicao = p.hashCode();
		Lista<Palavra> lista = dicionario[posicao];
		int tamanho = lista.size();

		for (int i = 0; i < tamanho; i++) {
			Palavra palavraLista = lista.get(i);
			if (palavraLista.verbete.equals(p.verbete)) {
				return palavraLista;
			}
		}
		throw new Exception("Palavra não encontrada");
	}

	@Override
	public void removePalavra(Palavra p) throws Exception {
		int posicao = p.hashCode();
		Lista<Palavra> lista = dicionario[posicao];
		int tamanho = lista.size();

		for (int i = 0; i < tamanho; i++) {
			Palavra palavraLista = lista.get(i);
			if (palavraLista.verbete.equals(p.verbete)) {
				lista.remove(i);
				break;
			}
		}
		throw new Exception("Palavra não encontrada");
	}

	@Override
	public void listarPalavras(String letra) throws Exception {
		char carac = letra.toLowerCase().charAt(0);
		int posicao = hash(carac);
		Lista<Palavra> lista = dicionario[posicao];
		int tamanho = lista.size();

		for (int i = 0; i < tamanho; i++) {
			Palavra p = lista.get(i);
			System.out.println(p.toString());
		}

	}

	private int hash(char carac) {
		int posicao = carac - 97;
		return posicao;
	}

}
