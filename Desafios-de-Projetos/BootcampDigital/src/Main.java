import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(12);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("descrição curso JavaScript");
		curso2.setCargaHoraria(25);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de Java");
		mentoria1.setDescricao("descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.print(curso1);
		System.out.print(curso2);
		System.out.print(mentoria1);
		*/
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setNome("Bootcamp Java Developer");
		bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
		bootcampJava.getConteudos().add(curso1);
		bootcampJava.getConteudos().add(curso2);
		bootcampJava.getConteudos().add(mentoria1);
		
		
		Dev devGustavo = new Dev();
		devGustavo.setNome("Gustavo");
		devGustavo.inscreverBootcamp(bootcampJava);
		System.out.println("Conteúdos Incritos Gustavo: " + devGustavo.getConteudosInscritos() + "\n");
		
		devGustavo.progredir();
		devGustavo.progredir();
		devGustavo.progredir();
		
		System.out.println("Conteúdos Incritos Gustavo: " + devGustavo.getConteudosInscritos() + "\n");
		System.out.println("Conteúdos Concluidos Gustavo: " + devGustavo.getConteudosConcluidos() + "\n");
		System.out.println("XP: " + devGustavo.calcularTotalXp());
		
		
		
	}
}
