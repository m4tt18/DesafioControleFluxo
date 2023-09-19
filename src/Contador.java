import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();
        terminal.nextLine();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        try {
            iniciarContador(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    static void iniciarContador(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }
        int iteracoes = parametro2 - parametro1;
        int numero = 1;
        while ( numero <= iteracoes) {
            System.out.println("Imprimindo o número " + numero);
            numero++;
        }
    }
}