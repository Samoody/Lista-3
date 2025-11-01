import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[50];

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite a primeira posição (0-49): ");
        int p1 = sc.nextInt();
        System.out.print("Digite a segunda posição (0-49): ");
        int p2 = sc.nextInt();

        if (vetor[p2] == 0) {
            System.out.println("Erro: divisão por zero!");
        } else {
            double resultado = (double) vetor[p1] / vetor[p2];
            System.out.println("Resultado da divisão: " + resultado);
        }
        sc.close();
    }
}
