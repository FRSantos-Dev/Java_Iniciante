import javax.swing.JOptionPane;

public class Teste4 {
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Seu nome é: " +nome);
    }
}
