import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMaior valor: " + maior + 
                           " na posição [" + linhaMaior + "][" + colunaMaior + "]");
        sc.close();
    }
}
