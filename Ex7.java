public class Ex7 {
    public static double media(int[] vetor) {
        int soma = 0;
        for (int n : vetor) soma += n;
        return (double) soma / vetor.length;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Média: " + media(numeros));
    }
}
