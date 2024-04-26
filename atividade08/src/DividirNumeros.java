import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o dividendo: ");
            double dividendo = scanner.nextDouble();

            System.out.print("Insira o divisor: ");
            double divisor = scanner.nextDouble();
            if (divisor == 0) {
                throw new ArithmeticException();
            }

            double resultadoDivisao = dividendo / divisor;

            System.out.println("O resultado da divisao e = " + resultadoDivisao);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Os valores devem ser numeros.");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Valor invalido. Nao e possivel realizar uma divisao com os valores informados.");
        }
    }
}
