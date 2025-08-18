package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso de java");
		curso1.setcargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso de JavaScript");
		curso2.setcargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Decricao bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devMaria.getConteudoInscritos());
		devMaria.progredir();
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos: " + devMaria.getConteudoInscritos());
		System.out.println("Conteúdos concluídos: " + devMaria.getConteudoConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());


		System.out.println("---------------------------------------");
		
		Dev devAlan = new Dev();
		devAlan.setNome("Alan");
		devAlan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devAlan.getConteudoInscritos());	
		devAlan.progredir();
		devAlan.progredir();
		devAlan.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos: " + devAlan.getConteudoInscritos());
		System.out.println("Conteúdos concluídos: " + devAlan.getConteudoConcluidos());
		System.out.println("XP: " + devAlan.calcularTotalXp());
	}

}
