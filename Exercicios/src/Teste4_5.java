import javax.swing.JOptionPane;
public class Teste4_5 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
        if (numero % 2 == 1){
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    }
}

