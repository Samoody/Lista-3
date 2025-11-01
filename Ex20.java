public class Ex20 {
    public static int maiorValor(int[] v, int i) {
        if (i == v.length - 1) return v[i];
        int maiorRestante = maiorValor(v, i + 1);
        return (v[i] > maiorRestante) ? v[i] : maiorRestante;
    }

    public static void main(String[] args) {
        int[] vetor = {3, 9, 1, 14, 7};
        System.out.println("Maior valor = " + maiorValor(vetor, 0));
    }
}
