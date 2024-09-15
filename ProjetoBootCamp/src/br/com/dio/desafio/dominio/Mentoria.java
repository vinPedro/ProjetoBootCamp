package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate dataDate;
	
	@Override
	public double calcularXp() {
		return getXpPadrao() + 20d;
	}
	
	@Override
	public String toString() {
		return "Mentoria [tituloString=" + getTituloString()+ ", descricaoString=" + getDescricaoString() + ", dataDate="
				+ dataDate + "]";
	}
	
	
	public LocalDate getDataDate() {
		return dataDate;
	}
	public void setDataDate(LocalDate dataDate) {
		this.dataDate = dataDate;
	}

}
