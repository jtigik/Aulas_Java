package br.com.jtigik.swing.calc.visao;

import br.com.jtigik.swing.calc.modelo.Memoria;
import br.com.jtigik.swing.calc.modelo.MemoriaObservador;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        // Display precisa se registrar para ser notificado quando o valor for atualizado.
        // Assim, quando um botão for pressionado, Display atualiza o Label.

        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("consolas", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }

}
