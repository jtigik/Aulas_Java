package br.com.jtigik.arrays_collection.lists.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {

    public static void main(String[] args) {
        List<String> tarefas = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("1. Adicionar tarefa");
                System.out.println("2. Remover tarefa");
                System.out.println("3. Listar tarefas");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite a tarefa: ");
                        String tarefa = scanner.nextLine();
                        tarefas.add(tarefa);
                        System.out.println("Tarefa adicionada!");
                    }
                    case 2 -> {
                        System.out.print("Digite o índice da tarefa a ser removida: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < tarefas.size()) {
                            tarefas.remove(indice);
                            System.out.println("Tarefa removida!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    case 3 -> {
                        System.out.println("Lista de tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + ": " + tarefas.get(i));
                        }
                    }
                    case 4 ->
                        System.out.println("Saindo...");
                    default ->
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 4);
        }
    }
}
