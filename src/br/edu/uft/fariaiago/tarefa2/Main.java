package br.edu.uft.fariaiago.tarefa2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Map<Sexo, List<Pessoa>> pessoas = new HashMap<>();
		List<Pessoa> masc = new ArrayList<>();
		List<Pessoa> femi = new ArrayList<>();
		pessoas.put(Sexo.MASCULINO, masc);
		pessoas.put(Sexo.FEMININO, femi);
		Scanner stdIn = new Scanner(System.in);
		String entrada;
		System.out.println("Entre pessoas no formato: Nome Sobrenome,Sexo(M/m ou F/f), escreva \"fim\" para parar.");
		while (!"fim".equals(entrada = stdIn.next())) {
			String[] valores = entrada.split(",");
			Sexo sx = Sexo.strParaEnum(valores[1]);
			Pessoa p = new Pessoa(valores[0], sx);
			pessoas.get(sx).add(p);
		}
		System.out.println("Masculinos:");
		System.out.println(pessoas.get(Sexo.MASCULINO));
		System.out.println("Femininos:");
		System.out.println(pessoas.get(Sexo.FEMININO));
		stdIn.close();
	}
}