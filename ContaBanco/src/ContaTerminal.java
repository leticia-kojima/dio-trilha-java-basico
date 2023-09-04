import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Importando a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Obtendo o nome do cliente
        System.out.println("Olá! Bem vindo(a) a ContaTerminal! Digite o seu nome, por gentileza!");
        String nomeCliente = scanner.next();

        //Obtendo o sobrenome do cliente
        System.out.println("Em seguida, digite o seu sobrenome!");
        String sobrenomeCliente = scanner.next();

        //Obtendo o numero da conta
        System.out.println("Para prosseguirmos, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        //Obtendo o numero da agencia
        System.out.println("Agora, por favor, digite o número da sua agência!");
        String agencia = scanner.next();

        //Obtendo o saldo 
        System.out.println("Qual seria o seu saldo em conta?");
        double saldo = scanner.nextDouble();

        //Mostrando o saldo para o cliente em tela
        System.out.println("Olá, " + nomeCliente + " "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
      
        //Fechando scanner
        scanner.close();

    }
}
