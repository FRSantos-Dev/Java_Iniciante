import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        //Por utilizar apenas numeros inteiros, não foi necessario LOCALE.
        Scanner sc = new Scanner(System.in);

        int M, N; // M= numero de linhas. N = numero de colunas

        System.out.print("Quantas linhas vai ter a matriz? ");
        M = sc.nextInt();
        System.out.println("Quantas colunas vai ter a matriz? ");
        N = sc.nextInt();

        int[][] mat = new int[M][N]; //Por ser matriz, arranjo de duas dimensões, utiliza colchetes duas vezes.

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt(); //Leitura do elementro da MATRIZ
            }
        }

        System.out.println(); //Serve paraltar uma linha.
        System.out.println("MATRIZ DIGITADA: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " "); //Mandando imprimir cada elemento da MATRIZ.
                // " " SERVE para dar espaço entre os elementeos.
            }
            System.out.println();
        }

        sc.close();
    }
}
