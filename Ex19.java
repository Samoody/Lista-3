public class Ex19 {
    public static int contarPares(int[] v, int i) {
        if (i == v.length) return 0;
        return ((v[i] % 2 == 0) ? 1 : 0) + contarPares(v, i + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {2, 5, 8, 11, 14};
        System.out.println("Quantidade de pares = " + contarPares(vetor, 0));
    }
}
