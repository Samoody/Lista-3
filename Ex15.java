import java.util.Scanner;

public class Ex15 {
    public static int soma(int n) {
        if (n == 1) return 1;
        return n + soma(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Soma de 1 até " + n + " = " + soma(n));
        sc.close();
    }
}
