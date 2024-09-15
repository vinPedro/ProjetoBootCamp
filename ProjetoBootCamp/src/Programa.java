import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Programa {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		
		curso1.setTituloString("curso java");
		curso1.setDescricaoString("descrição curso java");
		curso1.setCargaHoraria(8);
		
		curso2.setTituloString("curso javaScript");
		curso2.setDescricaoString("descrição curso javaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTituloString("mentoria de java");
		mentoria.setDescricaoString("descrição mentoria java");
		mentoria.setDataDate(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNomeString("Bootcamp Java Developer");
		bootcamp.setDecricaoString("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPedroDev = new Dev();
		devPedroDev.setNome("Pedro");
		devPedroDev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Pedro: " + devPedroDev.getConteudosInscritosSet());
		devPedroDev.progredir();
		System.out.println("---");
		devPedroDev.progredir();
		System.out.println("---");
		devPedroDev.progredir();
		System.out.println("---");
		System.out.println("Conteudos inscritos Pedro: " + devPedroDev.getConteudosInscritosSet());
		System.out.println("Conteudos concluidos Pedro: " + devPedroDev.getConteudosConcluidoSet());
		System.out.println("XP: " + devPedroDev.calcularTotalXp());
		
		System.out.println("---");
		
		Dev devCamilaDev = new Dev();
		devCamilaDev.setNome("Camila");
		devCamilaDev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Camila: " + devCamilaDev.getConteudosInscritosSet());
		devCamilaDev.progredir();
		System.out.println("---");
		devCamilaDev.progredir();
		System.out.println("---");
		System.out.println("Conteudos inscritos Camila: " + devCamilaDev.getConteudosInscritosSet());
		System.out.println("Conteudos concluidos Camila: " + devCamilaDev.getConteudosConcluidoSet());
		System.out.println("XP: " + devCamilaDev.calcularTotalXp());
		
		System.out.println("---");
		
		Dev devJoaoDev = new Dev();
		devJoaoDev.setNome("João");
		System.out.println("Conteudos inscritos João: " + devJoaoDev.getConteudosInscritosSet());
		devJoaoDev.progredir();
		System.out.println("---");
		System.out.println("Conteudos inscritos João: " + devJoaoDev.getConteudosInscritosSet());
		System.out.println("Conteudos concluidos João: " + devJoaoDev.getConteudosConcluidoSet());
		System.out.println("XP: " + devJoaoDev.calcularTotalXp());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
