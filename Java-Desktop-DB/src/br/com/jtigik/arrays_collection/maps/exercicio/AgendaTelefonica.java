package br.com.jtigik.arrays_collection.maps.exercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("1. Adicionar contato");
                System.out.println("2. Remover contato");
                System.out.println("3. Buscar contato");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o telefone: ");
                        String telefone = scanner.nextLine();
                        agenda.put(nome, telefone);
                        System.out.println("Contato adicionado!");
                    }
                    case 2 -> {
                        System.out.print("Digite o nome do contato a ser removido: ");
                        String nome = scanner.nextLine();
                        if (agenda.remove(nome) != null) {
                            System.out.println("Contato removido!");
                        } else {
                            System.out.println("Contato não encontrado!");
                        }
                    }
                    case 3 -> {
                        System.out.print("Digite o nome do contato: ");
                        String nome = scanner.nextLine();
                        String telefone = agenda.get(nome);
                        if (telefone != null) {
                            System.out.println("Telefone: " + telefone);
                        } else {
                            System.out.println("Contato não encontrado!");
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
