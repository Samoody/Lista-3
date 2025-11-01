import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean simetrica = true;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matriz[i][j] != matriz[j][i])
                    simetrica = false;

        System.out.println("\nA matriz é " + (simetrica ? "simétrica." : "não simétrica."));
        sc.close();
    }
}
