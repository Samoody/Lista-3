import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int contador = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10) contador++;
            }

        System.out.println("\nA matriz possui " + contador + " valores maiores que 10.");
        sc.close();
    }
}
