package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nomeString;
	private String decricaoString;
	private LocalDate dataIniciaLocalDate = LocalDate.now();
	private final LocalDate dataFinaLocalDate = dataIniciaLocalDate.plusDays(45);
	private Set<Dev> devsIncritoSet = new HashSet<Dev>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinaLocalDate, dataIniciaLocalDate, decricaoString, devsIncritoSet,
				nomeString);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinaLocalDate, other.dataFinaLocalDate)
				&& Objects.equals(dataIniciaLocalDate, other.dataIniciaLocalDate)
				&& Objects.equals(decricaoString, other.decricaoString)
				&& Objects.equals(devsIncritoSet, other.devsIncritoSet) && Objects.equals(nomeString, other.nomeString);
	}
	
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	public String getDecricaoString() {
		return decricaoString;
	}
	public void setDecricaoString(String decricaoString) {
		this.decricaoString = decricaoString;
	}
	public LocalDate getDataIniciaLocalDate() {
		return dataIniciaLocalDate;
	}
	public void setDataIniciaLocalDate(LocalDate dataIniciaLocalDate) {
		this.dataIniciaLocalDate = dataIniciaLocalDate;
	}
	public Set<Dev> getDevsIncritoSet() {
		return devsIncritoSet;
	}
	public void setDevsIncritoSet(Set<Dev> devsIncritoSet) {
		this.devsIncritoSet = devsIncritoSet;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataFinaLocalDate() {
		return dataFinaLocalDate;
	}
	
	
}
