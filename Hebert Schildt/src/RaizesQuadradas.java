// Exibe as raízes quadradas de 1 a 99 e o erro de arredondamento.

public class RaizesQuadradas {
    public static void main(String[] args) {
        double num, raiz, arredondamento;

        for(num = 1.0; num < 100.0; num++){
            raiz = Math.sqrt(num);
            System.out.println("Raiz quadrada de " + num + "é" + raiz);

            //calcula o erro de arredondamento
            arredondamento = num - (raiz * raiz);
            System.out.println("Erro de arredondamento é " + arredondamento);
            System.out.println();
        }
    }
}
