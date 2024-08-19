package br.com.jtigik.control;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "Amarela";

        switch (faixa) {
            case "Preta":
                System.out.println("Bassai-Dai");
            case "Marrom":
                System.out.println("Tekki-Shodan");
            case "Roxa":
                System.out.println("Heian Godan");
            case "Verde":
                System.out.println("Heian Yodan");
            case "Laranja":
                System.out.println("Heian Sandan");
            case "Vermelha":
                System.out.println("Heian Nidan");
            case "Amarela":
                System.out.println("Heian Shodan");
                break;
            default:
                System.out.println("Não sei de nada");
        }
        System.out.println("Fim!");

        int idade = 3;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar.");

            case 2:
                System.out.println("Sabe falar.");

            case 1:
                System.out.println("Sabe andar.");

            case 0:
                System.out.println("Sabe respirar.");
        }
    }
}
