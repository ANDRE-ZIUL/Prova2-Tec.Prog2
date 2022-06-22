package br.edu.univas.enums;

public enum TipoSanguineo {

	APOSITIVO("A POSITIVO"),
	ANEGATIVO("A NEGATIVO"),
	BPOSITIVO("B POSITIVO"),
	BNEGATIVO("A NEGATIVO"),
	ABPOSITIVO("AB POSITIVO"),
	ABNEGATIVO("AB NEGATIVO"),
	OPOSITIVO("O POSITIVO"),
	ONEGATIVO("O NEGATIVO");
	
	private String tipo;
	
	TipoSanguineo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public TipoSanguineo fromTipo(String tipo) {
		return TipoSanguineo.valueOf(tipo);
	}
}
