import javax.swing.*; 
import java.awt.event.*; 
 
public class exemplo1 { 
   public static void main(String[] args) { 
       // Criar a janela 
       JFrame frame = new JFrame("Exemplo Swing"); 
       frame.setSize(300, 150); 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
       // Criar componentes 
       JLabel label = new JLabel("Clique no botão:"); 
       JButton botao = new JButton("Clique aqui"); 
       JTextField texto = new JTextField(15); 
 
       // Ação ao clicar no botão 
       botao.addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent e) { 
               texto.setText("Você clicou no botão!"); 
           } 
       }); 
 
       // Criar painel e adicionar componentes 
       JPanel panel = new JPanel(); 
       panel.add(label); 
       panel.add(botao); 
       panel.add(texto); 
 
       // Adicionar o painel à janela 
       frame.add(panel); 
       frame.setVisible(true); 
   } 
} 
