import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[20];
        int maior, menor, posMaior = 0, posMenor = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        maior = menor = valores[0];
        for (int i = 1; i < 20; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                posMaior = i;
            }
            if (valores[i] < menor) {
                menor = valores[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior valor: " + maior + " (posição " + posMaior + ")");
        System.out.println("Menor valor: " + menor + " (posição " + posMenor + ")");
        sc.close();
    }
}
