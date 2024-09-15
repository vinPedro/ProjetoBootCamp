package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	private static final double XP_PADRAO = 10d; 
	private String tituloString;
	private String descricaoString;
	
	public abstract double calcularXp();

	public String getTituloString() {
		return tituloString;
	}

	public void setTituloString(String tituloString) {
		this.tituloString = tituloString;
	}

	public String getDescricaoString() {
		return descricaoString;
	}

	public void setDescricaoString(String descricaoString) {
		this.descricaoString = descricaoString;
	}

	public static double getXpPadrao() {
		return XP_PADRAO;
	}
	
	

}
