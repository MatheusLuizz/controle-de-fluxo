import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        try {
            contar(n1, n2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
    static void contar ( int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException();
        }
        int iteracoes = numero2 - numero1;
        for (int i = 0; i < iteracoes; i++) {
            System.out.println("imprimindo número " + (i + 1));
        }

    }
}