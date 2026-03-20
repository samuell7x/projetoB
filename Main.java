import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        String binario = "";

        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                binario = (numero % 2) + binario;
                numero /= 2;
            }
        }

        System.out.println("Binário: " + binario);

        scanner.close();
    }
}
