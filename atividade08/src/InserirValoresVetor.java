import java.util.*;

public class InserirValoresVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indexAtual = 0;
        int[] vetor = new int[10];

        System.out.println("Digite valores inteiros para adicionar no vetor, para encerrar digite 0: ");

        while (true) {
            try {
                int novoValor = scanner.nextInt();
                vetor[indexAtual] = novoValor;
                indexAtual++;

                if (novoValor == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido. Garanta que seja um numero inteiro!");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Tamanho máximo do vetor violado. Houve um erro ao tentar adicionar novo " +
                    "valor!");
                return;
            }
        }

        System.out.println("Valores informados: " + Arrays.toString(vetor));
    }
}
