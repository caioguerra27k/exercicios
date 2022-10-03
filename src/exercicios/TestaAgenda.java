package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaAgenda extends Agenda {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Programador programador = new Programador();
		Jogador jogador = new Jogador();

		System.out.println("digite o nome do evento");
		agenda.setEvent(leitor.nextLine());

	    System.out.println("digite uma data de inicio");
		agenda.setDateBegin(leitor.nextDouble());

	    System.out.println("digite uma data de término");
		agenda.setDateEnd(leitor.nextDouble());

		String confirmacao = "sim";

		while (confirmacao.equals("sim")) {

		
			System.out.println("você gostaria de adicionar alguém neste evento ?");
			System.out.println("Sim ou Nao");
			
			confirmacao = leitor.next().toLowerCase();

		switch (confirmacao.toLowerCase()) {
			case "sim":
				System.out.println("Essa pessoa é um Programador ou um Jogador ??");
				String resposta = leitor.next();
				if(resposta.toLowerCase().equals("programador") ){
					
					System.out.println("Digite o nome da pessoa");
					programador.setNome(leitor.next());

					System.out.println("Digite a idade da pessoa");
                    programador.setIdade(leitor.nextInt());

                    System.out.println("Digite a altura da pessoa");
					programador.setAltura(leitor.nextDouble());

					System.out.println("Digite o computador da pessoa");
					programador.setComputador(leitor.next());

					System.out.println("digite o headset da pessoa");
					programador.setHeadset(leitor.next());
                    
                    System.out.println();

					System.out.println("Digite o teclado da pessoa");
					programador.setTeclado(leitor.next());
                 }
				 else if(resposta.toLowerCase().equals("jogador")) {

						
						System.out.println("Digite o nome da pessoa");
						jogador.setNome(leitor.next());
	
						System.out.println("Digite a idade da pessoa");
						jogador.setIdade(leitor.nextInt());
	
						System.out.println("Digite a altura da pessoa");
						jogador.setAltura(leitor.nextDouble());
	
						System.out.println("Digite a Chuteria da pessoa");
						jogador.setChuteira(leitor.next());
	
						System.out.println("digite o meião da pessoa");
						jogador.setMeiao(leitor.next());

						System.out.println("Digite a bola da pessoa");
						jogador.setBola(leitor.next());} 

						
				break;
	
				case "nao":
				System.out.println();
				
				System.out.println(agenda.getEvent());
				System.out.println(agenda.getDateBegin()); 
				System.out.println(agenda.getDateEnd());

				if(programador.equals(true)){
					System.out.println(programador.getNome() + " " + programador.getIdade() + " " + programador.getAltura() + " " 
					+ programador.getComputador() + " " + programador.getHeadset() + " " + programador.getTeclado());
				} else if (jogador.equals(true)) {
					System.out.println(jogador.getNome() + " " + jogador.getIdade() + " " + jogador.getAltura() + " " + jogador.getChuteira() + " " + 
					jogador.getMeiao() + " " + jogador.getBola());
				} else if(programador.equals(true) && jogador.equals(true)){
					System.out.println(programador.getNome() + " " + programador.getIdade() + " " + programador.getAltura() + " " 
					+ programador.getComputador() + " " + programador.getHeadset() + " " + programador.getTeclado());

					System.out.println(jogador.getNome() + " " + jogador.getIdade() + " " + jogador.getAltura() + " " + jogador.getChuteira() + " " + 
					jogador.getMeiao() + " " + jogador.getBola());
				}

				break;
			}
		}
	  } 
}
  

