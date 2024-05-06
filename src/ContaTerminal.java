import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        double saldo = 237.48; 

        System.out.println("Olá " + nome + " Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua Agência: " + agencia);
        System.out.println("Sua Conta: " + conta);
        System.out.println("Seu saldo: R$ " + saldo + " Já está disponível para Saque");
        scanner.close();
    }
}
