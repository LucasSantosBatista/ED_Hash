package model;

import java.util.Objects;

public class Palavra {
	public String verbete;
	public String significado;

	@Override
	public String toString() {
		return "Palavra [verbete=" + verbete + ", significado=" + significado + "]";
	}

	@Override
	public int hashCode() {
		int posicao = verbete.toLowerCase().charAt(0);
		posicao = posicao - 97;
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palavra other = (Palavra) obj;
		return Objects.equals(significado, other.significado) && Objects.equals(verbete, other.verbete);
	}

}
