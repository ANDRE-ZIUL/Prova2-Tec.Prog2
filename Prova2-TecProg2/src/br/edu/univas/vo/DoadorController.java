package br.edu.univas.vo;

import java.util.Scanner;

import br.edu.univas.enums.TipoSanguineo;

public class DoadorController {

	static Scanner scanner = new Scanner(System.in);
	
	public Doador cadastrarDoador(long cpf, String tipoSanguineo) {
		Doador novoDoador = new Doador();
		novoDoador.setCpf(cpf);
		novoDoador.setTipoSanguineo(TipoSanguineo.valueOf(tipoSanguineo));
		
		try {
			return novoDoador;
		}catch(TipoSanguineoNotFoundException e) {
			System.out.println(e.message());
		}
		return novoDoador;
	}
	
	public void cadastrarDoacao(String tipoSanguineo, long quantidade) {
	
	}
}
