import java.util.Scanner;

public class App {

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println(ehPar(numero));

        scanner.close();
    }
}