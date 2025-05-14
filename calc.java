import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc {
    public static void main(String[] args) {
        // Criar a janela
        JFrame frame = new JFrame("Calculadora Simples");
        frame.setSize(400, 200); // Aumentado um pouco para melhor visualização
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar os componentes
        JTextField campo1 = new JTextField(8);
        JTextField campo2 = new JTextField(8);
        JTextField resultado = new JTextField(10);
        resultado.setEditable(false); // resultado não pode ser editado

        // Reduzir o tamanho visual dos campos de texto
        Dimension campoTamanho = new Dimension(80, 25); // largura x altura
        campo1.setMaximumSize(campoTamanho);
        campo2.setMaximumSize(campoTamanho);
        resultado.setMaximumSize(campoTamanho);

        JButton soma = new JButton("+");
        JButton sub = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");

        // Criar o painel com BoxLayout na vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Centralizar os componentes
        JLabel label1 = new JLabel("Número 1:");
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        campo1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel label2 = new JLabel("Número 2:");
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        campo2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelResultado = new JLabel("Resultado:");
        labelResultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        resultado.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Painel para os botões lado a lado
        JPanel botoes = new JPanel();
        botoes.add(soma);
        botoes.add(sub);
        botoes.add(mult);
        botoes.add(div);
        botoes.setAlignmentX(Component.CENTER_ALIGNMENT); // centralizar painel de botões

        // Adicionar componentes ao painel principal
        panel.add(label1);
        panel.add(campo1);
        panel.add(label2);
        panel.add(campo2);
        panel.add(botoes);
        panel.add(labelResultado);
        panel.add(resultado);

        // Lógica dos botões
        soma.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            resultado.setText(String.valueOf(n1 + n2));
        });

        sub.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            resultado.setText(String.valueOf(n1 - n2));
        });

        mult.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            resultado.setText(String.valueOf(n1 * n2));
        });

        div.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            if (n2 != 0) {
                resultado.setText(String.valueOf(n1 / n2));
            } else {
                resultado.setText("Erro: divisão por zero");
            }
        });

        // Adicionar painel à janela e mostrar
        frame.add(panel);
        frame.setVisible(true);
    }
}
// Aumentei o tamanho da janela e dos campos de texto para melhor visualização
