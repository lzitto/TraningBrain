package arrays.treinosdecodigos;

public class Treino {

    public static double raizQuadrada(double x, double erro) {
        if (x < 0) {
            throw new IllegalArgumentException("Não existe raiz real de número negativo!");
        }
        if (x == 0 || x == 1) {
            return x; // raiz de 0 é 0, de 1 é 1
        }

        double baixo = 0;
        double alto = (x < 1) ? 1 : x;
        double meio;

        while ((alto - baixo) > erro) {
            meio = (baixo + alto) / 2;
            double quadrado = meio * meio;

            if (Math.abs(quadrado - x) <= erro) {
                return meio; // Encontramos uma boa aproximação
            }

            if (quadrado < x) {
                baixo = meio; // raiz está mais à direita
            } else {
                alto = meio; // raiz está mais à esquerda
            }
        }

        return (baixo + alto) / 2; // aproximação final
    }

    public static void main(String[] args) {
        double x = 2;
        double erro = 0.00001;
        double raiz = raizQuadrada(x, erro);
        System.out.printf("A raiz quadrada de %.5f é aproximadamente %.5f%n", x, raiz);
    }
}
