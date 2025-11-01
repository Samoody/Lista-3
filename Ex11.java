import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] soma = new int[3][3];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M1[" + i + "][" + j + "]: ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDigite os valores da segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M2[" + i + "][" + j + "]: ");
                m2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                soma[i][j] = m1[i][j] + m2[i][j];

        System.out.println("\nMatriz soma:");
        for (int[] linha : soma) {
            for (int v : linha)
                System.out.print(v + "\t");
            System.out.println();
        }
        sc.close();
    }
}
