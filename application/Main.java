package application;

import java.util.List;
import java.util.Scanner;

import entities.GerenciadorDeTarefas;
import entities.Tarefas;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();
		int opcao = 0;

		System.out.println("#### GERENCIADOR DE TAREFAS ####\n");
		do {

			System.out.println("\nMENU: ");
			System.out.print("\n[1] ADICIONAR NOVA TAREFA\n" + "[2] LISTAR TAREFAS\n"
					+ "[3] MARCAR TAREFA COMO CONCLUIDA\n" + "[4] SAIR DO PROGRAMA\n\n" + "DIGITE SUA OPCAO: ");
			opcao = input.nextInt();
			if (opcao < 1 || opcao > 4) {
				System.out.println("\nOPCAO INVALIDA! TENTE NOVAMENTE.");
			}

			input.nextLine();
			switch (opcao) {

			case 1:
				String titulo, descricao, data;
				System.out.print("\nADICIONANDO NOVA TAREFA:\nTITULO: ");
				titulo = input.nextLine();
				System.out.print("\nDESCRICAO: ");
				descricao = input.nextLine();
				System.out.print("\nDATA DE CRIACAO: ");
				data = input.nextLine();
				Tarefas novaTarefa = new Tarefas(titulo, descricao, data);
				gerenciadorDeTarefas.AdicionarTarefa(novaTarefa);
				System.out.println("TAREFA ADICIONADA COM SUCESSO!");
				break;
			case 2:
				List<Tarefas> listaDeTarefas = gerenciadorDeTarefas.listarTarefas();
				System.out.println("\n#### LISTA DE TAREFAS ####\n");
				for (int i = 0; i < listaDeTarefas.size(); i++) {
					Tarefas tarefa = listaDeTarefas.get(i);
					System.out.println("TAREFA #" + (i + 1) + ": " + tarefa.getTitulo() + " - CONCLUIDA: " + tarefa.isConcluida());
				}
				break;
			case 3:
				System.out.print("DIGITE O NUMERO DA TAREFA QUE DESEJA MARCAR COMO CONCLUIDA: ");
                int indiceTarefa = input.nextInt();
                gerenciadorDeTarefas.marcarComoConcluida(indiceTarefa - 1);
                System.out.println("TAREFA MARCADA COMO CONCLUIDA!");
				
			}
		} while (opcao != 4);
		input.close();
	}
}