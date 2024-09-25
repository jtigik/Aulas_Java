package br.com.jtigik.swing.calc.modelo;

/*
 * Conceptually, a functional interface has exactly one abstract method.
 */
@FunctionalInterface
public interface MemoriaObservador {

    public void valorAlterado(String novoValor);
    //Todos métodos dentro de uma Interface, são 'public'
}
