package exercicios;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;

public class TestaAgenda extends Agenda {
	
	public static void main(String[] args, byte nextByte) {
		Scanner leitor = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Programador programador = new Programador();
		Jogador jogador = new Jogador();


		System.out.println("digite o nome do evento");
		agenda.setEvent(leitor.nextLine());

	    System.out.println("digite uma data de inicio");
		agenda.setDateBegin(leitor.equals(leitor.nextDouble());

	    System.out.println("digite uma data de término");
		agenda.setDateEnd(leitor.nextDouble());
        // receber de uma função
		adicionaPessoa = "sim";

		while (confirmacao.equals("sim")) {

		    //passar como função
			System.out.println("você gostaria de adicionar alguém neste evento ?");
			System.out.println("Sim ou Nao");
			
			confirmacao = leitor.next().toLowerCase();

		switch (confirmacao.toLowerCase()) {
			//Passar para funções
			case "sim":
			agenda.adicionaPessoa();
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

						agenda.adicionaPessoa;
						
				break;
	
				case "nao":
				System.out.println();
				
				System.out.println(agenda.getEvent());
				System.out.println(agenda.getDateBegin()); 
				System.out.println(agenda.getDateEnd());

				
					System.out.println(programador.getNome() + " " + programador.getIdade() + " " + programador.getAltura() + " " 
					+ programador.getComputador() + " " + programador.getHeadset() + " " + programador.getTeclado());
				 
					System.out.println(jogador.getNome() + " " + jogador.getIdade() + " " + jogador.getAltura() + " " + jogador.getChuteira() + " " + 
					jogador.getMeiao() + " " + jogador.getBola());
				
				break;
			}
		}
	  } 
}
  

