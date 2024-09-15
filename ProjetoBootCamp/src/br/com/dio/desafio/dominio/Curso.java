package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return getXpPadrao() * cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTituloString() + ", descricao=" + getDescricaoString()+ ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
