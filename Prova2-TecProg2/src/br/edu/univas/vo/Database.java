package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.Map;

public class Database {
	
	private static ArrayList<Doador> doadores;
	
	private static Map<String, Long> estoqueSanguineo;
	
	private static void addDoador(Doador doador) {
		doadores.add(doador);
	}
	
	public static void addDoacao(String tipoSanguineo, long quantidade) {
		estoqueSanguineo.put(tipoSanguineo, quantidade);
	}
	
	public static long getSituacaoEstoque(String tipoSanguineo) {
		return estoqueSanguineo.get(tipoSanguineo);
		
	}
}
