import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o Número da Agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o Número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo que deseja depositar em Conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
