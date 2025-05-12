import javax.swing.*;
import java.awt.event.*;

public class calculadora {
    public static void main(String[] args) {
        // Criar a janela
        JFrame frame = new JFrame("Calculadora Simples");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar os componentes
        JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);
        JTextField resultado = new JTextField(10);
        resultado.setEditable(false); // resultado não pode ser editado

        JButton soma = new JButton("+");
        JButton sub = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");

        // Painel para organizar
        JPanel panel = new JPanel();
        panel.add(new JLabel("Número 1:"));
        panel.add(campo1);
        panel.add(new JLabel("Número 2:"));
        panel.add(campo2);
        panel.add(soma);
        panel.add(sub);
        panel.add(mult);
        panel.add(div);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultado);

        // Lógica dos botões
        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(campo1.getText());
                double n2 = Double.parseDouble(campo2.getText());
                resultado.setText(String.valueOf(n1 + n2));
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(campo1.getText());
                double n2 = Double.parseDouble(campo2.getText());
                resultado.setText(String.valueOf(n1 - n2));
            }
        });

        mult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(campo1.getText());
                double n2 = Double.parseDouble(campo2.getText());
                resultado.setText(String.valueOf(n1 * n2));
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(campo1.getText());
                double n2 = Double.parseDouble(campo2.getText());
                if (n2 != 0) {
                    resultado.setText(String.valueOf(n1 / n2));
                } else {
                    resultado.setText("Erro: divisão por zero");
                }
            }
        });

        // Adicionar painel à janela e mostrar
        frame.add(panel);
        frame.setVisible(true);
    }
}
