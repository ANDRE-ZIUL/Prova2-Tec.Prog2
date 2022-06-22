package br.edu.univas.vo;

public class TipoSanguineoNotFoundException extends RuntimeException{

	public String message() {
		String messageError = "TIPO SANGUINEO INVÁLIDO";
		return messageError;
	}
}
