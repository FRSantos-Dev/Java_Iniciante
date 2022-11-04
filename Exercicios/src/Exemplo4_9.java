import javax.swing.*;

public class Exemplo4_9 {
    public static void main(String[] args) {
        String codigo;
        codigo = JOptionPane.showInputDialog("Digite o código");
        switch (codigo) {
            case "001": JOptionPane.showMessageDialog(null,  "O Produto é Caderno");
            break;
            case "002": JOptionPane.showMessageDialog
                    (null, "O Produto é Lápis");
            case "003": JOptionPane.showMessageDialog
                    (null, "O Produto é Borracha");
            break;
            default: JOptionPane.showMessageDialog(null, "Diversos");
        }
    }
}
