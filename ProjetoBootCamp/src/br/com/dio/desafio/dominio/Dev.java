package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritosSet = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluidoSet = new LinkedHashSet<Conteudo>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritosSet.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritoSet().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudoOptional = this.conteudosInscritosSet.stream().findFirst();
		if(conteudoOptional.isPresent()) {
			this.conteudosConcluidoSet.add(conteudoOptional.get());
			this.conteudosInscritosSet.remove(conteudoOptional.get());
		}
		else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidoSet
				.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidoSet, conteudosInscritosSet, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidoSet, other.conteudosConcluidoSet)
				&& Objects.equals(conteudosInscritosSet, other.conteudosInscritosSet)
				&& Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritosSet() {
		return conteudosInscritosSet;
	}

	public void setConteudosInscritosSet(Set<Conteudo> conteudosInscritosSet) {
		this.conteudosInscritosSet = conteudosInscritosSet;
	}

	public Set<Conteudo> getConteudosConcluidoSet() {
		return conteudosConcluidoSet;
	}

	public void setConteudosConcluidoSet(Set<Conteudo> conteudosConcluidoSet) {
		this.conteudosConcluidoSet = conteudosConcluidoSet;
	}
	
	

}
