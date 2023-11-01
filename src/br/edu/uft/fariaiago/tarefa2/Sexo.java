package br.edu.uft.fariaiago.tarefa2;

public enum Sexo {
	MASCULINO, FEMININO;
	
	public static Sexo strParaEnum(String sexo) {
		switch (sexo) {
		case "M":
		case "m":
			return Sexo.MASCULINO;
		case "F":
		case "f":
			return Sexo.FEMININO;
		default:
			return Sexo.FEMININO;
		}
	}
}