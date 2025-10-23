package aula7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploSwing extends JFrame {

    private JTextField campoNome;
    private JButton botao;
    private JLabel labelMensagem;

    public ExemploSwing() {
        super("Exemplo Java Swing");

        setLayout(new FlowLayout());

        JLabel jLabel = new JLabel("Digite seu nome");
        campoNome = new JTextField(15);
        botao = new JButton("Enviar");
        labelMensagem = new JLabel("");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                labelMensagem.setText("Ola " + nome + "!");
            }
        });
        add(jLabel);
        add(labelMensagem);
        add(campoNome);
        add(botao);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploSwing();
            }
        });
    }
}
