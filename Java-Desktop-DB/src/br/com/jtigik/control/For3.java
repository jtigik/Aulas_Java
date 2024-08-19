package br.com.jtigik.control;

public class For3 {
    public static void main(String[] args) {

        // Uso de FOR encadeados.

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d - %d]", i, j);
            }
            System.out.println();
        }
    }
}
